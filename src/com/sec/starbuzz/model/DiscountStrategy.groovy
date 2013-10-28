package com.sec.starbuzz.model

class DiscountStrategy {
    boolean enabled = false;
    float rate;

    public float discountRate() {
         return rate;
    }
}
