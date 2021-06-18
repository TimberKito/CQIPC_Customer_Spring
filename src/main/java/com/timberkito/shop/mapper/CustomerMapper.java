package com.timberkito.shop.mapper;

import com.timberkito.shop.model.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CustomerMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer customer);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectAllCustomers();
}