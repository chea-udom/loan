package com.springboot.loan.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.springboot.loan.models.CustomerModel;

public class CustomerRequest extends PersonRequest {

    private String cardId;

    public CustomerModel toModel() throws ParseException {
        return new CustomerModel(null, getName(), getSex(), getPosition(), new SimpleDateFormat().parse(getDob()),
                cardId);
    }
}
