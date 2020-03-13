package com.atguigu.providerticket.controller;

import com.atguigu.providerticket.service.ticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ticketController {

    @Autowired
    ticketService ticketService; //springCloud以http的方式进行接口间的调用

    public String getTicket(){
       return ticketService.getTicket();
    }
}
