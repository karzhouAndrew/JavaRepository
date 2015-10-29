package lab43;

import java.util.LinkedList;
import java.util.Queue;

/**
 Задание 10
 Напишите программу, моделирующую кассы в магазине. Суще-ствует несколько касс, работающих одновременно.
 */
public class RunCashDesk {
    public static void main(String[] args) throws InterruptedException {
        Queue<CustomerGoods> queue = new LinkedList<CustomerGoods>();

        CashDesk cashDesk1 = new CashDesk("Касса 1");
        CashDesk cashDesk2 = new CashDesk("Касса 2");
        CashDesk cashDesk3 = new CashDesk("Касса 3");


        for (int i = 0; i < 17; i++) {
            queue.add(new CustomerGoods());
        }


        while (queue.size() != 0) {
            if (queue.size() != 0) {
                cashDesk1.setListCustomer(queue.poll().doShopping());
                new Thread(cashDesk1).run();
            }

            if (queue.size() != 0) {
                cashDesk2.setListCustomer(queue.poll().doShopping());
                new Thread(cashDesk2).run();
            }

            if (queue.size() != 0) {
                cashDesk3.setListCustomer(queue.poll().doShopping());
                new Thread(cashDesk3).run();
            }
        }
    }
}
