package com.timberkito.shop.controller;

import com.timberkito.shop.model.Customer;
import com.timberkito.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController // 此类所有方法返回JSON
public class CustomerController{

    @Autowired
    private CustomerService customerService;

    /**
     * 查询所有客户
     *
     * @return
     */
    @RequestMapping(value = "/api/customer/selectall", method = RequestMethod.GET)
    public List selectAll(){
        return customerService.selectAllCustomers();
    }

    /**
     * 查询指定id客户
     *
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
     *
     * @param id
     * @param username
     * @param jobs
     * @param phone
     * @return
     */
    @RequestMapping(value = "/api/customer/add", method = RequestMethod.POST)
    public int add(Integer id, String username, String jobs, String phone){
        Customer customer = new Customer(id, username, jobs, phone);
        int ret = customerService.insertSelective(customer);
        if (ret == 1) {
            return 200;
        } else {
            return 400;
        }
    }


    /**
     * 删除指定id客户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/customer/delete", method = RequestMethod.POST)
    public int deleteByPrimaryKey(Integer id){
        int ret = customerService.deleteByPrimaryKey(id);
        if (ret == 1) {
            return 200;
        } else {
            return 400;
        }
    }


    /**
     * 修改用户
     *
     * @param id
     * @param username
     * @param jobs
     * @param phone
     * @return
     */
    @RequestMapping(value = "/api/customer/update", method = RequestMethod.POST)
    public int update(Integer id, String username, String jobs, String phone){
        Customer customer = new Customer(id, username, jobs, phone);
        int ret = customerService.updateByPrimaryKeySelective(customer);
        if (ret == 1) {
            return 200;
        } else {
            return 400;
        }
    }
}
