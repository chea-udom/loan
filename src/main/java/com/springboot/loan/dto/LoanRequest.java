package com.springboot.loan.dto;

import com.springboot.loan.models.LoanModel;

public class LoanRequest implements Request<LoanModel> {

    private double loanAmt;

    private CustomerRequest customereRequest;

    private DealerRequest dealerRequest;

    public LoanModel toModel(){
        return new LoanModel(null, loanAmt, customereRequest.toModel(), dealerRequest.toModel());
    }
}
