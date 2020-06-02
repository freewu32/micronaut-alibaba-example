package com.github.freewu32.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/order")
public class OrderController {

    @Post("/create")
    public void create(@Body CreateOrderRequest request) {
        //TODO service
    }
}
