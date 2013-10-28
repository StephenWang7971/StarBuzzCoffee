package com.sec.starbuzz.model.beverage

import com.sec.starbuzz.model.DiscountStrategy

abstract class Drinkable {
    public float price;
    public String name;
    public DiscountStrategy strategy;

    def buy() {
        if (strategy != null && strategy.enabled) {
            print name + "(" + String.valueOf(price) + "*" + strategy.discountRate() + ")";
        } else {
            print name + "(" + String.valueOf(price) + ")";
        }
    }
}