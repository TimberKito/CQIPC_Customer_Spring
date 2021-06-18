package com.timberkito.shop.service.impl;

import com.timberkito.shop.mapper.CustomerMapper;
import com.timberkito.shop.model.Customer;
import com.timberkito.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer queryCustomerById(Integer id){
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Customer customer){
        return customerMapper.insertSelective(customer);
    }

    @Override
    public List selectAllCustomers(){
        return customerMapper.selectAllCustomers();
    }

    @Override
    public int deleteByPrimaryKey(Integer id){
        return customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer customer){
        return customerMapper.updateByPrimaryKeySelective(customer);
    }

}
