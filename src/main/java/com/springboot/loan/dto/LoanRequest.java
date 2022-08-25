package com.springboot.loan.dto;

import com.springboot.loan.models.CustomerModel;
import com.springboot.loan.models.DealerModel;
import com.springboot.loan.models.LoanModel;

public class LoanRequest {

    private double loanAmt;

    private CustomerModel customer;

    private DealerModel dealerModel;

    public LoanModel toModel(){
        return new LoanModel(null, loanAmt, customer, dealerModel);
    }
}
