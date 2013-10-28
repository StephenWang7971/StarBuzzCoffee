package com.sec.starbuzz.model

import java.text.DecimalFormat

abstract class Drinkable {
    public BigDecimal price;
    public String name;
    public DiscountStrategy strategy;

    def buy() {
        DecimalFormat formatter = new DecimalFormat("#.00");
        if (strategy != null && strategy.enabled) {
            print name + "(" + formatter.format(price) + "*" + formatter.format(strategy.rate) + ")";
        } else {
            print name + "(" + formatter.format(price) + ")";
        }
    }

    def BigDecimal getPrice() {
        if (strategy != null && strategy.enabled) {
            return price * strategy.rate;
        } else {
            return price;
        }
    }
}