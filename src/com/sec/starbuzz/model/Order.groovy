package com.sec.starbuzz.model

import com.sec.starbuzz.model.beverage.Drinkable
import com.sec.starbuzz.model.condiment.Dressable

class Order {
    public List<Dressable> dressables = new ArrayList<Dressable>();
    public Drinkable drinkable;

    public void buy() {
        drinkable.buy()
        dressables.each({ e -> e.buy() })
        print "|Total=" + total();
        println();
    }

    public float total() {
        float total =  drinkable.price;
        dressables.each { e-> total += e.price}
        return total;
    }

    def append(Drinkable drinkable) {
        this.drinkable = drinkable
    }

    def append(Dressable dressable) {
        this.dressables.add(dressable);
    }

}
