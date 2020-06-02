package com.github.freewu32.example;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Patch;

@Controller("/product")
public class ProductController {

    @Patch("/sku/stock/update")
    public void updateSkuStock(@Body UpdateSkuStockRequest request) {
        //TODO service
    }
}
