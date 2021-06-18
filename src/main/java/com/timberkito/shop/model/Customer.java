package com.timberkito.shop.model;

import org.springframework.stereotype.Component;

public class Customer{
    private Integer id;

    private String username;

    private String jobs;

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs == null ? null : jobs.trim();
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone == null ? null : phone.trim();
    }

    public Customer(Integer id, String username, String jobs, String phone){
        this.id = id;
        this.username = username;
        this.jobs = jobs;
        this.phone = phone;
    }

    public Customer(){
    }
}