package com.springboot.loan.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="tb_dealer")
@ToString(callSuper = true)
@NoArgsConstructor
public class DealerModel extends PersonModel {

    public DealerModel(Long id, String name, String sex, String position, Date dob){
        super(id, name, sex, position, dob);
    }

    @Override
    @Column(name = "dealer_id", nullable = false, unique = true)
    public Long getId(){
        return super.getId();
    }
}
