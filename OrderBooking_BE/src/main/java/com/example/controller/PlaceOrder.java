package com.example.controller;

import com.example.beans.CustomerOrder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/orderdetails")
public class PlaceOrder {

    @RequestMapping(value="/addOrder", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public void addOrder(CustomerOrder custOrder) {
        boolean res;
        int ExecutionPrice = 150;
        int ExecutionQty = 60;

        if(custOrder.isMarketState()) {
            if(custOrder.getPrice() >= ExecutionPrice) {
                res = true;
            } else {
                res = false;
            }
        } else {
            res = false;
        }
    }
    
}

