package com.sec.starbuzz.model

class DiscountStrategy {
    boolean enabled = false;
    float rate;

    public DiscountStrategy() {
    }
    public DiscountStrategy(float rate) {
        this.rate = rate;
    }
}
