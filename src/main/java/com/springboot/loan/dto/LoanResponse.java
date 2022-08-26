package com.springboot.loan.dto;

import com.springboot.loan.models.LoanModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanResponse implements Response<LoanModel> {
    private Long id;
    private double loanAmt;
    private CustomerResponse customerResponse;
    private DealerResponse dealerResponse;
    @Override
    public LoanModel toModel() {
        return new LoanModel(id, loanAmt, customerResponse.toModel(), dealerResponse.toModel());
    }
}
