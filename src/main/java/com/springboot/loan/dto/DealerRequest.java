package com.springboot.loan.dto;


import com.springboot.loan.models.DealerModel;
import com.springboot.loan.utils.DateUtils;

public class DealerRequest extends PersonRequest<DealerModel> {

    @Override
    public DealerModel toModel() {
        return new DealerModel(null, name, sex, position, DateUtils.dateFormat(dob));
    }
    
}
