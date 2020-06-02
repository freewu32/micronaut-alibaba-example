package com.github.freewu32.example;

import io.micronaut.core.annotation.Introspected;

import java.io.Serializable;

@Introspected
public class UpdateSkuStockRequest implements Serializable {
    private Long skuId;

    private int number;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
