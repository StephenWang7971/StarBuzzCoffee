package com.sec.starbuzz.model

import java.text.DecimalFormat

class Drinkable {
    BigDecimal price
    String name
    DiscountStrategy strategy
    Category category

    enum Category {
       BEVERAGE, CONDIMENT
    }

    Drinkable(String name, BigDecimal price, Category category = Category.BEVERAGE, DiscountStrategy strategy = null) {
        this.name = name
        this.price = price
        this.category = category
        this.strategy = strategy
    }

    def buy() {
        DecimalFormat formatter = new DecimalFormat("#.00")
        if (strategy != null && strategy.enabled && strategy.rate != 1f) {
            print name + "(" + formatter.format(price) + "*" + formatter.format(strategy.rate) + ")"
        } else {
            print name + "(" + formatter.format(price) + ")"
        }
    }

    def BigDecimal getPrice() {
        if (strategy != null && strategy.enabled) {
            return price * strategy.rate
        } else {
            return price
        }
    }
}