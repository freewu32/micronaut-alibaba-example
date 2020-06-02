package com.github.freewu32.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/account")
public class AccountController {

    /**
     * 支付金额
     */
    @Post("/pay")
    public void pay(@Body PayRequest request) {
        //TODO service
    }
}
