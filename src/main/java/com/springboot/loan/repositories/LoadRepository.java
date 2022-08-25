package com.springboot.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.loan.models.LoanModel;

@Repository
public interface LoadRepository extends JpaRepository<LoanModel, Long> {
    
}
