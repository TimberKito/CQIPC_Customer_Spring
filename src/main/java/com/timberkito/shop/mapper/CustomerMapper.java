package com.timberkito.shop.mapper;

import com.timberkito.shop.model.Customer;
import org.apache.ibatis.annotations.Mapper;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}