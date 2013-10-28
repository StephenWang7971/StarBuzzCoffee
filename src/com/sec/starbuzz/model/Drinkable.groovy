package com.sec.starbuzz.model

import java.text.DecimalFormat

class Drinkable {
    BigDecimal price
    String name
    BigDecimal discountRate
    Category category

    enum Category {
       BEVERAGE, CONDIMENT
    }

    Drinkable(String name, BigDecimal price, Category category = Category.BEVERAGE, BigDecimal discountRate = null) {
        this.name = name
        this.price = price
        this.category = category
        this.discountRate = discountRate
    }

    def buy() {
        DecimalFormat formatter = new DecimalFormat("#.00")
        if (discountRate != null && discountRate != 1f) {
            print name + "(" + formatter.format(price) + "*" + formatter.format(discountRate) + ")"
        } else {
            print name + "(" + formatter.format(price) + ")"
        }
    }

    def BigDecimal getPrice() {
        if (discountRate != null) {
            return price * discountRate
        } else {
            return price
        }
    }
}