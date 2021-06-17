package com.timberkito.shop.service.impl;

import com.timberkito.shop.mapper.CustomerMapper;
import com.timberkito.shop.model.Customer;
import com.timberkito.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer queryCustomerById(Integer id){
        return customerMapper.selectByPrimaryKey(id);
    }
}
