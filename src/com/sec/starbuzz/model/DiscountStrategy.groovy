package com.sec.starbuzz.model

class DiscountStrategy {
    boolean enabled = false;
    BigDecimal rate;

    public DiscountStrategy() {
    }
    public DiscountStrategy(BigDecimal rate) {
        this.rate = rate;
    }
}
