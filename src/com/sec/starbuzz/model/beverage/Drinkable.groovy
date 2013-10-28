package com.sec.starbuzz.model.beverage

abstract class Drinkable {
    public float price;
    public String name;

    def buy() {
        print name + "(" + String.valueOf(price) + ")";
    }
}