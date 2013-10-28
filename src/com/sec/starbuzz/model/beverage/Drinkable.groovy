package com.sec.starbuzz.model.beverage

import com.sec.starbuzz.model.DiscountStrategy

abstract class Drinkable {
    public float price;
    public String name;

    def buy(DiscountStrategy strategy) {
        if (strategy.enabled){
            print name + "(" + String.valueOf(price) + "*" + strategy.discountRate() + ")";
        } else {
            print name + "(" + String.valueOf(price) + ")";
        }
    }
}