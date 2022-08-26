package com.springboot.loan.dto;

import com.springboot.loan.models.DealerModel;
import com.springboot.loan.utils.DateUtils;

public class DealerResponse extends PersonResponse<DealerModel> {
    public DealerResponse(Long id, String name, String sex, String position, String dob){
        super(id, name, sex, position, dob);
    }

    @Override
    public DealerModel toModel() {
        return new DealerModel(id, name, sex, position, DateUtils.dateFormat(dob));
    }
}
