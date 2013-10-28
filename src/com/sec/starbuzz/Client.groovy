package com.sec.starbuzz

import com.sec.starbuzz.model.Order
import com.sec.starbuzz.model.beverage.Beer
import com.sec.starbuzz.model.beverage.BlackTea
import com.sec.starbuzz.model.beverage.Coffee
import com.sec.starbuzz.model.beverage.Coke
import com.sec.starbuzz.model.beverage.GreenTea
import com.sec.starbuzz.model.beverage.PlainTea
import com.sec.starbuzz.model.condiment.Chocolate
import com.sec.starbuzz.model.condiment.Honey
import com.sec.starbuzz.model.condiment.Lemon
import com.sec.starbuzz.model.condiment.Milk
import com.sec.starbuzz.model.condiment.Mocha

class Client {
    public static void main(def args) {
        Order order = new Order();
        order.append(new Coffee());
        order.buy();

        Order order1 = new Order();
        order1.append(new PlainTea());
        order1.buy();

        Order order2 = new Order();
        order2.append(new Beer());
        order2.buy();

        Order order3 = new Order();
        order3.append(new Coke());
        order3.buy();


        Order order4 = new Order();
        order4.append(new Coffee());
        order4.append(new Milk());
        order4.buy();

        Order order5 = new Order();
        order5.append(new BlackTea());
        order5.append(new Honey());
        order5.buy();

        Order order6 = new Order();
        order6.append(new Beer());
        order6.append(new Lemon());

        Order order7 = new Order();
        order7.append(new Coke());
        order7.append(new Lemon());
        order7.buy();



        Order order8 = new Order();
        order8.append(new Coffee());
        order8.append(new Honey());
        order8.append(new Milk());
        order8.buy();

        Order order9 = new Order();
        order9.append(new GreenTea());
        order9.append(new Honey());
        order9.append(new Milk());
        order9.append(new Chocolate());
        order9.buy();

        Order order10 = new Order();
        order10.append(new Coke());
        order10.append(new Milk());
        order10.append(new Honey());
        order10.append(new Lemon());
        order10.append(new Chocolate());
        order10.append(new Mocha());
        order10.buy();
    }

}
