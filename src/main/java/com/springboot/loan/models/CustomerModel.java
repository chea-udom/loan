package com.springboot.loan.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tb_cus")
@ToString(callSuper = true)
public class CustomerModel extends PersonModel {

    @Column(name="cus_card_id")
    private String cardId;

    public CustomerModel(Long id, String name, String sex, String position, Date dob, String cardId) {
        super(id, name, sex, position, dob);
        this.cardId = cardId;
    }
    @Override
    @Column(name="cus_id", nullable = false, unique = true)
    public Long getId(){
        return super.getId();
    }


}
