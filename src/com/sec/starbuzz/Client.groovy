package com.sec.starbuzz

import com.sec.starbuzz.model.Order
import com.sec.starbuzz.model.beverage.*
import com.sec.starbuzz.model.condiment.*

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


        Order order11 = new Order();
        order11.append(new LoveFeelings());
        order11.buy();


        Order order12 = new Order();
        order12.append(new LoveFeelings());
        order12.append(new Lemon());
        order12.buy();


        Order order13 = new Order();
        order13.append(new LoveFeelings());
        order13.append(new Milk());
        order13.append(new Honey());
        order13.append(new Lemon());
        order13.append(new Chocolate());
        order13.append(new Mocha());
        order13.buy();

        Order order14 = new Order();
        order14.append(new Beer());
        order14.append(new LoversEmbrace());
        order14.buy();

        Order order15 = new Order();
        order15.append(new LoveFeelings());
        order15.append(new LoversEmbrace());
        order15.buy();

        Order order16 = new Order();
        order16.append(new LoveFeelings());
        order16.append(new Lemon());
        order16.append(new LoversEmbrace());
        order16.buy();


        Order order17 = new Order();
        order17.append(new Coffee());
        order17.append(new Sugar());
        order17.buy();

        Order order18 = new Order();
        order18.append(new Milk());
        order18.buy();

        Order order19 = new Order();
        order19.append(new Lemon());
        order19.append(new LoversEmbrace());
        order19.buy();
    }

}
