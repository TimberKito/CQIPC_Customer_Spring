package com.timberkito.shop.mapper;

import com.timberkito.shop.model.Customer;

import java.util.List;

public interface CustomerMapper{
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Customer customer);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    List<Customer> selectAllCustomers();
}