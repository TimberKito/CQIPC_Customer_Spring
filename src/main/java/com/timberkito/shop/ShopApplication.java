package com.timberkito.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.timberkito.shop.mapper")
public class ShopApplication{

//    private static Logger logger = LoggerFactory.getLogger(ShopApplication.class);

    public static void main(String[] args){
//        logger.info("SpringBoot 应用开始启动 ... ");
        SpringApplication.run(ShopApplication.class, args);
    }

}
