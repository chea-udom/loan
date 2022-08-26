package com.springboot.loan.models;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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
@AttributeOverrides({
    @AttributeOverride(name = "id",column = @Column(name="cus_id")),
    @AttributeOverride(name = "name",column = @Column(name="cus_name")),
    @AttributeOverride(name = "sex",column = @Column(name="cus_sex")),
    @AttributeOverride(name = "dob",column = @Column(name="cus_dob")),
    @AttributeOverride(name = "position",column = @Column(name="cus_pos"))
})
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
    @Column(name="cus_id")
    public Long getId(){
        return super.getId();
    }

    @Override
    @Column(name = "cus_name")
    public String getName(){
        return super.getName();
    }

    @Override
    @Column(name = "cus_sex")
    public String getSex(){
        return super.getSex();
    }

    @Override
    @Column(name = "cus_pos")
    public String getPosition(){
        return super.getPosition();
    }

    @Override
    @Column(name = "cus_dob")
    public Date getDob(){
        return super.getDob();
    }
}
