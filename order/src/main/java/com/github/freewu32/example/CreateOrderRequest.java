package com.github.freewu32.example;

import io.micronaut.core.annotation.Introspected;

import java.io.Serializable;
import java.util.List;

@Introspected
public class CreateOrderRequest implements Serializable {
    private Long userId;

    private List<CreateOrderSkuItemRequest> skus;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<CreateOrderSkuItemRequest> getSkus() {
        return skus;
    }

    public void setSkus(List<CreateOrderSkuItemRequest> skus) {
        this.skus = skus;
    }
}
