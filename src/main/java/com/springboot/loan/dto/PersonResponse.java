package com.springboot.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class PersonResponse<T> implements Response<T> {

    protected Long id;

    protected String name;

    protected String sex;

    protected String position;

    protected String dob;
}
