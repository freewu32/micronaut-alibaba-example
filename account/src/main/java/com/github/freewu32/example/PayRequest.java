package com.github.freewu32.example;

import io.micronaut.core.annotation.Introspected;

import java.io.Serializable;
import java.math.BigDecimal;

@Introspected
public class PayRequest implements Serializable {
    private Long userId;

    private BigDecimal money;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
