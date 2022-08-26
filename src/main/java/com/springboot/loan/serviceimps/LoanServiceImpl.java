package com.springboot.loan.serviceimps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.loan.dto.CustomerResponse;
import com.springboot.loan.dto.DealerResponse;
import com.springboot.loan.dto.LoanRequest;
import com.springboot.loan.dto.LoanResponse;
import com.springboot.loan.models.CustomerModel;
import com.springboot.loan.models.DealerModel;
import com.springboot.loan.models.LoanModel;
import com.springboot.loan.repositories.LoanRepository;
import com.springboot.loan.services.LoanService;
import com.springboot.loan.utils.DateUtils;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public LoanModel getById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }

    @Override
    public boolean isExisted(LoanModel loanModel) {
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
        boolean existed = isExisted(loanModel);
        if (existed) {
            loanRepository.delete(loanModel);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        boolean existed = loanRepository.existsById(id);
        if (existed) {
            loanRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public LoanResponse getForResponse(LoanModel model) {
        CustomerModel cus=model.getCustomer();
        DealerModel dealer=model.getDealer();
        return new LoanResponse(model.getId(),model.getLoanAmt(),
            new CustomerResponse(cus.getId(), cus.getName(), cus.getSex(), cus.getPosition(), DateUtils.toString(cus.getDob()),cus.getCardId()),
            new DealerResponse(dealer.getId(), dealer.getName(), dealer.getSex(), dealer.getPosition(), DateUtils.toString(dealer.getDob()))
            );
    }

}
