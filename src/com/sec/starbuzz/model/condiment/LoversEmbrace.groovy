package com.sec.starbuzz.model.condiment

import com.sec.starbuzz.model.DiscountStrategy


class LoversEmbrace extends Dressable {
    public LoversEmbrace() {
        this.name = "Love Embrace";
        this.price = 21f;
        this.strategy = new DiscountStrategy();
        strategy.enabled = true;
        strategy.rate = 0.8f;
    }
}
