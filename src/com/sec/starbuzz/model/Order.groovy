package com.sec.starbuzz.model

import com.sec.starbuzz.model.beverage.Drinkable
import com.sec.starbuzz.model.beverage.LoveFeelings
import com.sec.starbuzz.model.condiment.Dressable
import com.sec.starbuzz.model.condiment.LoversEmbrace

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
        float total = drinkable.price;
        dressables.each { e -> total += e.getPrice() }
        return total;
    }

    def append(Drinkable drinkable) {
        this.drinkable = drinkable
    }

    def append(Dressable dressable) {
        DiscountStrategy strategy = new DiscountStrategy();
        if (drinkable instanceof LoveFeelings) {
            strategy.enabled = true;
            strategy.rate = 0.8f;

            if (dressable instanceof LoversEmbrace) {
                strategy.rate = 0.5f;
            }
            dressable.strategy = strategy;
        }
        this.dressables.add(dressable);
    }

}
