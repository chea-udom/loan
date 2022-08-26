package com.springboot.loan.dto;

import com.springboot.loan.models.CustomerModel;
import com.springboot.loan.utils.DateUtils;

public class CustomerRequest extends PersonRequest<CustomerModel> {

    private String cardId;

    public CustomerModel toModel(){
        return new CustomerModel(null, getName(), getSex(), getPosition(), DateUtils.dateFormat(getDob()), cardId);
    }
}
