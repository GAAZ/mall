package com.mall.mallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DW@daiwang
 * @date 2020/9/24 13:11
 */
@MapperScan("com.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args){
        SpringApplication.run(MallProductApplication.class,args);
    }
}
