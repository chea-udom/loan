package com.springboot.loan.services;

import java.util.List;

import com.springboot.loan.dto.LoanRequest;
import com.springboot.loan.models.LoanModel;

public interface LoanService {

    LoanModel getById(Long id);

    boolean isExisted(LoanModel loanModel);

    LoanModel saveLoan(LoanRequest loanRequest);

    LoanModel saveLoan(LoanModel loanModel);

    List<LoanModel> getLoanList();

    boolean deleteLoan(LoanModel loanModel);

    boolean deleteLoan(Long id);
}
