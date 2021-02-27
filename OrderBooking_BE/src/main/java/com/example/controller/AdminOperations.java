package com.example.controller;

import com.example.beans.CustomerOrder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminOperations {

    public boolean MarketState;

    @RequestMapping(value="/closeMarket", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerOrder CloseMarket() {
        MarketState = false;
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setMarketState(MarketState);
        return customerOrder;
    }

    @RequestMapping(value="/openMarket", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerOrder OpenMarket() {
        MarketState = true;
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setMarketState(MarketState);
        return customerOrder;
    }

    @RequestMapping(value="/executeOrder", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String ExecuteOrder(CustomerOrder custOrder) {
        java.lang.String status;
        int ExecutionPrice = 150;
        int ExecutionQty = 60;
        if(custOrder.isMarketState()) {

        } else {
            status = "Market is closed";
            return status;
        }
    }

}
