package com.springboot.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.loan.models.DealerModel;

@Repository
public interface DealerRepository extends JpaRepository<DealerModel, Long> {
    
}
