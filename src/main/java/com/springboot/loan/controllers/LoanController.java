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

import com.springboot.loan.models.CustomerModel;
import com.springboot.loan.models.DealerModel;
import com.springboot.loan.models.LoanModel;
import com.springboot.loan.serviceimps.CustomerServiceImpl;
import com.springboot.loan.serviceimps.DealerServiceImpl;
import com.springboot.loan.serviceimps.LoanServiceImpl;

@Controller
@RequestMapping("/loan")
public class LoanController {
    
    @Autowired
    private LoanServiceImpl loanService;
    @Autowired
    private CustomerServiceImpl customerService;
    @Autowired
    private DealerServiceImpl dealerService;

    @GetMapping
    public ModelAndView loanPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("loan_page");
        LoanModel loan=new LoanModel();
        loan.setCustomer(new CustomerModel());
        loan.setDealer(new DealerModel());
        modelAndView.addObject("loanModel", loan);

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
        CustomerModel cus=loan.getCustomer();
        DealerModel dealer=loan.getDealer();

        customerService.save(cus);
        dealerService.save(dealer);
        loanService.save(loan);

        System.out.println(loan);
        return "loan_page";
        
    }

}
