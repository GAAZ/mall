package com.mall.mallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author DW@daiwang
 * @date 2020/9/24 13:11
 */
@EnableFeignClients(basePackages = "com.mall.mallproduct.feign")
@EnableDiscoveryClient
@MapperScan("com.mall.mallproduct.dao")
@SpringBootApplication
public class MallProductApplication {
    
    public static void main(String[] args){
        SpringApplication.run(MallProductApplication.class,args);
    }
}
