package com.springboot.loan.services;

import java.util.List;

import com.springboot.loan.dto.Request;
import com.springboot.loan.dto.Response;


public interface Service<T, U extends Request, V extends Response> {
    T getById(Long id);

    boolean isExisted(T model);

    T save(U request);

    T save(T model);

    List<T> getList();

    boolean delete(T model);

    boolean delete(Long id);

    V getForResponse(T model);

    
}
