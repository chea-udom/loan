package com.springboot.loan.services;

import com.springboot.loan.dto.CustomerRequest;
import com.springboot.loan.dto.CustomerResponse;
import com.springboot.loan.models.CustomerModel;

public interface CustomerService extends Service<CustomerModel, CustomerRequest, CustomerResponse> {
    
}