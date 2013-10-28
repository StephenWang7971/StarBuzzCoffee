package com.sec.starbuzz.model

import com.sec.starbuzz.model.DiscountStrategy

abstract class Drinkable {
    public float price;
    public String name;
    public DiscountStrategy strategy;

    def buy() {
        if (strategy != null && strategy.enabled) {
            print name + "(" + String.valueOf(price) + "*" + strategy.rate + ")";
        } else {
            print name + "(" + String.valueOf(price) + ")";
        }
    }

    def float getPrice() {
        if (strategy != null && strategy.enabled) {
            return price * strategy.rate;
        } else {
            return price;
        }
    }
}