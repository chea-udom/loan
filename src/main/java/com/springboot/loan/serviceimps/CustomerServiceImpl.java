package com.springboot.loan.serviceimps;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.loan.dto.CustomerRequest;
import com.springboot.loan.models.CustomerModel;
import com.springboot.loan.repositories.CustomerRepository;
import com.springboot.loan.services.CustomerService;

@Service
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerModel getById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public boolean isExisted(CustomerModel model) {
        return customerRepository.existsById(model.getId());
    }

    @Override
    public CustomerModel save(CustomerRequest request) {
        CustomerModel model=null;
        try{
            return customerRepository.save(request.toModel());
        }catch(ParseException ex){
            ex.printStackTrace();
        }
        return model;
    }

    @Override
    public CustomerModel save(CustomerModel model) {
        return customerRepository.save(model);
    }

    @Override
    public List<CustomerModel> getList() {
        return customerRepository.findAll();
    }

    @Override
    public boolean delete(CustomerModel model) {
        boolean existed = isExisted(model);
        if(existed){
            customerRepository.delete(model);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        boolean existed = customerRepository.existsById(id);
        if(existed){
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}
