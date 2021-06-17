package com.timberkito.shop.controller;

import com.timberkito.shop.model.Customer;
import com.timberkito.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController{

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/info")
    public @ResponseBody
    Object customerInfo(Integer id){
        Customer customer = customerService.queryCustomerById(id);
        return customer;
    }
    
}
