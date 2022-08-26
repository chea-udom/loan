package com.springboot.loan.dto;


import com.springboot.loan.models.DealerModel;
import com.springboot.loan.utils.DateUtils;

public class DealerRequest extends PersonRequest {
    
    public DealerModel toModel() {
        return new DealerModel(null, getName(), getSex(), getPosition(), DateUtils.dateFormat(getDob()));
    }
}
