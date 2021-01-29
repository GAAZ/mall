package com.mall.mallproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DW@daiwang
 * @date 2020/9/24 13:11
 */

@EnableDiscoveryClient
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args){
        SpringApplication.run(MallProductApplication.class,args);
    }
}
