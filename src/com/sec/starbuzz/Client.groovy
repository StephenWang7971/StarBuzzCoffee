package com.sec.starbuzz

import com.sec.starbuzz.model.Drinkable
import com.sec.starbuzz.model.*

class Client {
    public static void main(def args) {
        Order order = new Order()
        order.append(new Drinkable("Coffee", 22f))
        order.buy()

        Order order1 = new Order()
        order1.append(new Drinkable("Plain Tea", 25f))
        order1.buy()

        Order order2 = new Order()
        order2.append(new Drinkable("Beer", 18f))
        order2.buy()

        Order order3 = new Order()
        order3.append(new Drinkable("Coke", 12f))
        order3.buy()

        Order order4 = new Order()
        order4.append(new Drinkable("Coffee", 22f))
        order4.append(new Drinkable("Milk", 3.5f, Drinkable.Category.CONDIMENT))
        order4.buy()

        Order order5 = new Order()
        order5.append(new Drinkable("Black Tea", 25f))
        order5.append(new Drinkable("Honey", 8.0f, Drinkable.Category.CONDIMENT))
        order5.buy()

        Order order6 = new Order()
        order6.append(new Drinkable("Beer", 18f))
        order6.append(new Drinkable("Lemon", 5f, Drinkable.Category.CONDIMENT))

        Order order7 = new Order()
        order7.append(new Drinkable("Coke", 12f))
        order7.append(new Drinkable("Lemon", 5f, Drinkable.Category.CONDIMENT))
        order7.buy()

        Order order8 = new Order()
        order8.append(new Drinkable("Coffee", 22f))
        order8.append(new Drinkable("Honey", 4.5f, Drinkable.Category.CONDIMENT))
        order8.append(new Drinkable("Milk", 3.5f, Drinkable.Category.CONDIMENT))
        order8.buy()

        Order order9 = new Order()
        order9.append(new Drinkable("Green Tea", 25f))
        order9.append(new Drinkable("Honey", 4.5f, Drinkable.Category.CONDIMENT))
        order9.append(new Drinkable("Milk", 3.5f, Drinkable.Category.CONDIMENT))
        order9.append(new Drinkable("Chocolate", 7f, Drinkable.Category.CONDIMENT))
        order9.buy()

        Order order10 = new Order()
        order10.append(new Drinkable("Coke", 12f))
        order10.append(new Drinkable("Milk", 3.5f, Drinkable.Category.CONDIMENT))
        order10.append(new Drinkable("Honey", 4.5f, Drinkable.Category.CONDIMENT))
        order10.append(new Drinkable("Lemon", 5f, Drinkable.Category.CONDIMENT))
        order10.append(new Drinkable("Chocolate", 7f, Drinkable.Category.CONDIMENT))
        order10.append(new Drinkable("Mocha", 8f, Drinkable.Category.CONDIMENT))
        order10.buy()

        Order order11 = new Order()
        order11.append(new Drinkable("Love Feelings",49f))
        order11.buy()

        Order order12 = new Order()
        order12.append(new Drinkable("Love Feelings",49f))
        order12.append(new Drinkable("Lemon", 5f, Drinkable.Category.CONDIMENT))
        order12.buy()

        Order order13 = new Order()
        order13.append(new Drinkable("Love Feelings",49f))
        order13.append(new Drinkable("Milk", 3.5f, Drinkable.Category.CONDIMENT))
        order13.append(new Drinkable("Honey", 4.5f, Drinkable.Category.CONDIMENT))
        order13.append(new Drinkable("Lemon", 5f, Drinkable.Category.CONDIMENT))
        order13.append(new Drinkable("Chocolate", 7f, Drinkable.Category.CONDIMENT))
        order13.append(new Drinkable("Mocha", 8f, Drinkable.Category.CONDIMENT))
        order13.buy()

        Order order14 = new Order()
        order14.append(new Drinkable("Beer", 18f))
        order14.append(new Drinkable("Lovers Embrace", 21f, Drinkable.Category.CONDIMENT))
        order14.buy()

        Order order15 = new Order()
        order15.append(new Drinkable("Love Feelings", 49f))
        order15.append(new Drinkable("Lovers Embrace", 21f, Drinkable.Category.CONDIMENT))
        order15.buy()

        Order order16 = new Order()
        order16.append(new Drinkable("Love Feelings",49f))
        order16.append(new Drinkable("Lemon", 5f, Drinkable.Category.CONDIMENT))
        order16.append(new Drinkable("Lovers Embrace", 21f, Drinkable.Category.CONDIMENT))
        order16.buy()

        Order order17 = new Order()
        order17.append(new Drinkable("Coffee", 22f))
        order17.append(new Drinkable("Sugar", 1f, Drinkable.Category.CONDIMENT))
        order17.buy()

        Order order18 = new Order()
        order18.append(new Drinkable("Milk", 3.5f, Drinkable.Category.CONDIMENT, 1f))
        order18.buy()

        Order order19 = new Order()
        order19.append(new Drinkable("Lemon", 5f))
        order19.append(new Drinkable("Lovers Embrace", 21f, Drinkable.Category.CONDIMENT, 0.8f))
        order19.buy()

        Order order20 = new Order()
        order20.append(new Drinkable("Love Feelings", 49f))
        order20.append(new Drinkable("Lemon", 5f, Drinkable.Category.CONDIMENT))
        order20.append(new Drinkable("Lovers Embrace", 21f, Drinkable.Category.CONDIMENT))
        order20.buy(0.9f)
    }

}
