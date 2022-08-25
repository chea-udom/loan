package com.springboot.loan.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class PersonRequest {

    private String name;

    private String sex;

    private String dob;

    private String position;

}
