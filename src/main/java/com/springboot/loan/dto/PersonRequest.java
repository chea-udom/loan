package com.springboot.loan.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class PersonRequest<T> implements Request<T> {

    protected String name;

    protected String sex;

    protected String dob;

    protected String position;

}
