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
    @Column(name = "dealer_id")
    public Long getId(){
        return super.getId();
    }

    @Override
    @Column(name = "dealer_name")
    public String getName(){
        return super.getName();
    }

    @Override
    @Column(name = "dealer_sex")
    public String getSex(){
        return super.getSex();
    }

    @Override
    @Column(name = "dealer_pos")
    public String getPosition(){
        return super.getPosition();
    }

    @Override
    @Column(name = "dealer_dob")
    public Date getDob(){
        return super.getDob();
    }
}
