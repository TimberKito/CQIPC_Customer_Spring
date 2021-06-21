package com.timberkito.shop.controller;

import com.timberkito.shop.model.Customer;
import com.timberkito.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController // 此类所有方法返回JSON
public class CustomerController{

    @Autowired
    private CustomerService customerService;

    /**
     * 查询客户列表
     * @return
     */
    @RequestMapping(value = "/api/customer/selectall", method = RequestMethod.GET)
    public List selectAll(){
        return customerService.selectAllCustomers();
    }

    /**
     * 通过ID查询单个客户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/customer/info", method = RequestMethod.GET)
    public Object customerInfo(Integer id){
        Customer customer = customerService.queryCustomerById(id);
        return customer;
    }

    /**
     * 添加客户
     * @param customer
     * @return
     */
    @RequestMapping(value = "/api/customer/add", method = RequestMethod.POST)
    public int add(Customer customer){
        int ret = customerService.insertSelective(customer);
        if (ret == 1) {
            return 200;
        } else {
            return 400;
        }
    }

    /**
     * 通过ID删除客户
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/customer/delete", method = RequestMethod.DELETE)
    public int deleteByPrimaryKey(Integer id){
        int ret = customerService.deleteByPrimaryKey(id);
        if (ret == 1) {
            return 200;
        } else {
            return 400;
        }
    }

    /**
     * 修改客户信息
     * @param customer
     * @return
     */
    @RequestMapping(value = "/api/customer/update", method = RequestMethod.PUT)
    public int update(Customer customer){
        int ret = customerService.updateByPrimaryKeySelective(customer);
        if (ret == 1) {
            return 200;
        } else {
            return 400;
        }
    }
}
