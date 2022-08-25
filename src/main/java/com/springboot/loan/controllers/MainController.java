package com.springboot.loan.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.loan.models.LoanModel;

@Controller
public class MainController {


    @GetMapping
    public ModelAndView index() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/loan")
    public ModelAndView loanPage(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("loan_page");
        modelAndView.addObject("loanModel", new LoanModel());
        modelAndView.addObject("simpleDateFormatter", new SimpleDateFormat());
        return modelAndView;
    }
    @PostMapping("/loan")
    public ModelAndView submitLoan(@ModelAttribute LoanModel loan){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("loan_page");
        System.out.println(loan);
        return modelAndView;
    }
}
