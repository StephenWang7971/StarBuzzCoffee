package com.sec.starbuzz.model.condiment

abstract class Dressable {
    public float price;
    public String name;

    def buy() {
        print " + " + name + "(" + String.valueOf(price) + ")";
    }
}