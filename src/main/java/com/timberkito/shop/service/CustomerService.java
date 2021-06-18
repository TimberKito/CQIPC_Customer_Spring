package com.timberkito.shop.service;

import com.timberkito.shop.model.Customer;

import java.util.List;

public interface CustomerService{

    Customer queryCustomerById(Integer id);

    int insertSelective(Customer customer);

    List selectAllCustomers();

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer customer);
}
