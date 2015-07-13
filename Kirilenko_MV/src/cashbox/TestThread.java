package cashbox;

import java.util.*;

/*
 * Created by champion on 25.06.15.
 * Потоки. Кассы и покупатели. Кассы - 3 потока. Очередь из 100 покупателей.
 * Каждому из покупателей в корзину ложим рандомное количество (от 1 до 10) продуктов
 * из enum. Касса отпускает по одному товару в 0.1сек.
 */

public class TestThread {
    public static void main(String[] args) {
        int numberBuyers = 100;
        System.out.println("Start");
        Queue<Buyer> buyers = new LinkedList<>();

        for (int i = 1; i < numberBuyers; i++) {
            Buyer buyer = new Buyer(String.valueOf(i));
            buyer.addGoods();
            buyers.add(buyer);
        }

        for (int i = 0; i < 3; i++) {
            CashBox cashbox = new CashBox(buyers);
            cashbox.start();
        }
    }
}
