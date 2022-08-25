package com.springboot.loan.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table(name="tb_dealer")
@ToString(callSuper = true)
public class DealerModel extends PersonModel {
    @Override
    @Column(name = "dealer_id", nullable = false, unique = true)
    public Long getId(){
        return super.getId();
    }
}
