package com.springboot.loan.dto;

import com.springboot.loan.models.CustomerModel;
import com.springboot.loan.utils.DateUtils;

public class CustomerResponse extends PersonResponse<CustomerModel>  {

    private String cardId;

    public CustomerResponse(Long id, String name, String sex, String position, String dob, String cardId){
        super(id, name, sex, position, dob);
        this.cardId=cardId;
    }

    @Override
    public CustomerModel toModel() {
        return new CustomerModel(id, name, sex, position, DateUtils.dateFormat(dob), cardId);
    }
}
