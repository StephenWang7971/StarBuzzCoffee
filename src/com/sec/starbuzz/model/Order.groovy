package com.sec.starbuzz.model


import java.text.DecimalFormat

class Order {
    List<Drinkable> drinkables = new ArrayList<Drinkable>()

    //TODO this influenced too much.
    //DiscountStrategy fridaySpecialDiscount = new DiscountStrategy(0.9f)

    public void buy() {
        DecimalFormat formatter = new DecimalFormat("#.00");
        for (int i = 0; i < drinkables.size(); i++) {
            if (i != 0) {
                print " + "
            }
            drinkables.get(i).buy()
        }
        print "|Total=" + formatter.format(total())
        println();
    }

    public BigDecimal total() {
        BigDecimal total = 0;
        drinkables.each { e -> total += e.getPrice() }
       // if (fridaySpecialDiscount.enabled) {
       //     total *= fridaySpecialDiscount.rate
       // }
        return total
    }

    def append(Drinkable drinkable) {
        DiscountStrategy strategy = new DiscountStrategy()

        if (drinkables.any { e -> e.name.equals("Love Feelings") }) {
            strategy.enabled = true
            strategy.rate = new BigDecimal(0.8)

            if (drinkable.name.equals("Lovers Embrace")) {
                strategy.rate = 0.5f
            }
            drinkable.strategy = strategy
        }
        this.drinkables.add(drinkable)
    }

}
