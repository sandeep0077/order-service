package com.programmingtechie.orderservice.controller;


import com.programmingtechie.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderResquest){
        return "Order placed sucsessfully";
    }
}
