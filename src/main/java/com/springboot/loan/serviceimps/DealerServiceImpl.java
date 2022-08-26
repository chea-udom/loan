package com.springboot.loan.serviceimps;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.loan.dto.DealerRequest;
import com.springboot.loan.models.DealerModel;
import com.springboot.loan.repositories.DealerRepository;
import com.springboot.loan.services.DealerService;

@Service
public class DealerServiceImpl implements DealerService {

    @Autowired
    private DealerRepository dealerRepository;

    @Override
    public DealerModel getById(Long id) {
        return dealerRepository.findById(id).orElse(null);
    }

    @Override
    public boolean isExisted(DealerModel model) {
        return dealerRepository.existsById(model.getId());
    }

    @Override
    public DealerModel save(DealerRequest request) {
        DealerModel model=null;
        try{
            return dealerRepository.save(request.toModel());
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return model;
    }

    @Override
    public DealerModel save(DealerModel model) {
        return dealerRepository.save(model);
    }

    @Override
    public List<DealerModel> getList() {
        return dealerRepository.findAll();
    }

    @Override
    public boolean delete(DealerModel model) {
        boolean existed = isExisted(model);
        if(existed){
            dealerRepository.delete(model);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        boolean existed = dealerRepository.existsById(id);
        if(existed){
            dealerRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}
