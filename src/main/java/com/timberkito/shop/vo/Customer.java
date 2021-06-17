package com.timberkito.shop.vo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class Customer{

    private Integer id;
    private String username;
    private String jobs;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getJobs(){
        return jobs;
    }

    public void setJobs(String jobs){
        this.jobs = jobs;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    private String phone;

}
