package com.springboot.loan.serviceimps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.loan.dto.LoanRequest;
import com.springboot.loan.dto.Request;
import com.springboot.loan.models.LoanModel;
import com.springboot.loan.repositories.LoanRepository;
import com.springboot.loan.services.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public LoanModel getById(Long id){
        return loanRepository.findById(id).orElse(null);
    }

    @Override
    public boolean isExisted(LoanModel loanModel){
        return loanRepository.existsById(loanModel.getId());
    }

    @Override
    public List<LoanModel> getList() {
        
        return loanRepository.findAll();
    }

    @Override
    public LoanModel save(LoanRequest loanRequest) {
        return loanRepository.save(loanRequest.toModel());
    }

    @Override
    public LoanModel save(LoanModel loanModel) {
        return loanRepository.save(loanModel);
    }

    @Override
    public boolean delete(LoanModel loanModel) {
        boolean existed=isExisted(loanModel);
        if(existed){
            loanRepository.delete(loanModel);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        boolean existed=loanRepository.existsById(id);
        if(existed){
            loanRepository.deleteById(id);
            return true;
        }
        return false;
    }

    
    
}
