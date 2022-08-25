package com.springboot.loan.services;

import com.springboot.loan.dto.LoanRequest;
import com.springboot.loan.dto.LoanResponse;
import com.springboot.loan.models.LoanModel;

public interface LoanService extends Service <LoanModel, LoanRequest, LoanResponse> {

}
