package com.sec.starbuzz.model.condiment

import com.sec.starbuzz.model.DiscountStrategy

abstract class Dressable {
    public float price;
    public String name;
    public DiscountStrategy strategy;

    def buy() {
        if (strategy != null && strategy.enabled) {
            print "+" + name + "(" + String.valueOf(price) + "*" + strategy.discountRate() + ")";
        } else {
            print "+" + name + "(" + String.valueOf(price) + ")";
        }
    }

    def float getPrice() {
        if (strategy != null && strategy.enabled) {
            return price * strategy.discountRate(); ;
        }
        return price;
    }
}