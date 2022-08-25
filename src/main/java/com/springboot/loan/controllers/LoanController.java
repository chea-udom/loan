package com.springboot.loan.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.loan.models.LoanModel;
import com.springboot.loan.serviceimps.LoanServiceImpl;

@Controller
@RequestMapping("/loan")
public class LoanController {
    
    @Autowired
    private LoanServiceImpl loanService;

    @GetMapping
    public ModelAndView loanPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("loan_page");
        modelAndView.addObject("loanModel", new LoanModel());

        return modelAndView;
    }
    @PostMapping
    public String submitLoan(@ModelAttribute LoanModel loan, @RequestParam("cus_dob") String cusDob, @RequestParam("dealer_dob") String dealerDob){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        try{
            loan.getCustomer().setDob(format.parse(cusDob));
            loan.getDealer().setDob(format.parse(dealerDob));
        }catch(ParseException ex){
            loan.getCustomer().setDob(new Date());
            loan.getDealer().setDob(new Date());
            ex.printStackTrace();
        }
        //loanService.saveLoan(loan);
        System.out.println(loan);
        return "loan_page";
        
    }

}
