package com.sec.starbuzz.model

import com.sec.starbuzz.model.beverage.Drinkable
import com.sec.starbuzz.model.beverage.LoveFeelings
import com.sec.starbuzz.model.condiment.Dressable

class Order {
    public List<Dressable> dressables = new ArrayList<Dressable>();
    public Drinkable drinkable;

    DiscountStrategy beverageStrategy = new DiscountStrategy();
    DiscountStrategy condimentStrategy = new DiscountStrategy();

    public void buy() {
        drinkable.buy(beverageStrategy)
        dressables.each({ e -> e.buy(condimentStrategy) })
        print "|Total=" + total();
        println();
    }

    public float total() {
        float total = drinkable.price;
        float rate = 1f;
        if (condimentStrategy.enabled) {
            rate = condimentStrategy.discountRate();
        }
        dressables.each { e -> total += e.price * rate  }
        return total;
    }

    def append(Drinkable drinkable) {
        this.drinkable = drinkable
        if(drinkable instanceof LoveFeelings) {
            condimentStrategy.enabled = true;
            condimentStrategy.rate = 0.8f;
        }
    }

    def append(Dressable dressable) {
        this.dressables.add(dressable);
    }

}
