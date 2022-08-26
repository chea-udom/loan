package com.springboot.loan.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_loan")
@ToString
public class LoanModel {
    @Id
    @Column(name="loan_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ln_amt")
    private double loanAmt;

    @OneToOne
    @JoinColumn(name="cus_id",nullable = false)
    private CustomerModel customer;

    @OneToOne
    @JoinColumn(name="dealer_id", nullable = false)
    private DealerModel dealer;

    
}
