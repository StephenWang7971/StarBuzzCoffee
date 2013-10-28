package com.sec.starbuzz.model.condiment

import com.sec.starbuzz.model.DiscountStrategy
import com.sec.starbuzz.model.Drinkable

class LoversEmbrace extends Drinkable {
    public LoversEmbrace() {
        this.name = "Love Embrace";
        this.price = 21f;
        this.strategy = new DiscountStrategy();
        strategy.enabled = true;
        strategy.rate = 0.8f;
    }
}
