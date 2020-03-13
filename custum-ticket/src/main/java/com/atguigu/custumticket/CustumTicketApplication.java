package com.atguigu.custumticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient //开启发现服务功能
@SpringBootApplication
public class CustumTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustumTicketApplication.class, args);
    }

}
