package com.sec.starbuzz.model

import com.sec.starbuzz.model.beverage.LoveFeelings

import com.sec.starbuzz.model.condiment.LoversEmbrace

class Order {
    public List<Drinkable> drinkables = new ArrayList<Drinkable>();

    public void buy() {
        drinkables.each({ e -> e.buy() })
        print "|Total=" + total();
        println();
    }

    public float total() {
        float total = 0;
        drinkables.each { e -> total += e.getPrice() }
        return total;
    }


    def append(Drinkable drinkable) {
        DiscountStrategy strategy = new DiscountStrategy();
        if (drinkables.any {e -> e instanceof LoveFeelings}) {
            strategy.enabled = true;
            strategy.rate = 0.8f;

            if (drinkable instanceof LoversEmbrace) {
                strategy.rate = 0.5f;
            }
            drinkable.strategy = strategy;
        }
        this.drinkables.add(drinkable);
    }

}
