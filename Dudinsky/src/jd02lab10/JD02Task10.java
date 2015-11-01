package jd02lab10;

/*Задание 10. Напишите программу, моделирующую кассы в магазине. Существует несколько касс, работающих одновременно.
Общее количество покупателей может быть больше чем количество касс, но одновременно не может обрабатываться больше покупателей,
чем имеется рабочих касс. У каждого покупателя есть набор товаров, которые  должны быть выведены  в процессе обслуживания.*/

import java.io.PrintStream;

public class JD02Task10 {

    private static final int SHOP_OPEN_PERIOD = 6000;
    private static final int MIN_VISITORS_INTERVAL = 350;
    private static final PrintStream OUT = System.out;
    private static final int INITIAL_CASH_DESK_QUANTITY = 2;
    private static final int INITIAL_CASH_DESK_WORK_PERIOD = 2500;
    private static final int CLOSING_CASH_DESK_QUANTITY = 1;
    private static final int RESIDUAL_CASH_DESK_WORK_PERIOD = 1000;
    private static final int ADDING_CASH_DESK_QUANTITY = 2;

    public static void main(String[] args) {
        Shop shop = new Shop(OUT);
        CustomerGen customerGen = new CustomerGen(SHOP_OPEN_PERIOD, MIN_VISITORS_INTERVAL, shop.getCashDesks(), OUT);
        shop.initCashDesks(INITIAL_CASH_DESK_QUANTITY, customerGen);
        Thread customerGenThread = new Thread(customerGen);
        customerGenThread.start();
        try {
            Thread.sleep(INITIAL_CASH_DESK_WORK_PERIOD);
        } catch (InterruptedException e) {
            customerGenThread.interrupt();
            return;
        }
        shop.stopCashDesks(CLOSING_CASH_DESK_QUANTITY);
        try {
            Thread.sleep(RESIDUAL_CASH_DESK_WORK_PERIOD);
        } catch (InterruptedException e) {
            customerGenThread.interrupt();
            return;
        }
        shop.addCashDesks(ADDING_CASH_DESK_QUANTITY);
    }
}

/* OUTPUT:
-> Cash Desk 1 is opening now <-
-> Cash Desk 2 is opening now <-
           Customer 1 is queueing up in cash desk 1 now
      Customer 1 is being served in cash desk 1 now: [CPU: 2 pcs., USB-drive: 3 pcs., USB-drive: 2 pcs., Monitor: 2 pcs.]
           Customer 2 is queueing up in cash desk 1 now
           Customer 3 is queueing up in cash desk 2 now
      Customer 3 is being served in cash desk 2 now: [CPU: 3 pcs., Case: 3 pcs.]
           Customer 4 is queueing up in cash desk 2 now
           Customer 5 is queueing up in cash desk 1 now
      Customer 2 is being served in cash desk 1 now: [Monitor: 1 pcs., Case: 2 pcs., Mouse: 1 pcs.]
           Customer 6 is queueing up in cash desk 1 now
           Customer 7 is queueing up in cash desk 2 now
      Customer 4 is being served in cash desk 2 now: [USB-drive: 2 pcs., Monitor: 3 pcs., Monitor: 3 pcs.]
           Customer 8 is queueing up in cash desk 2 now
-> CashDesk 2 is switching to closing mode now <-
      Customer 7 is being served in cash desk 2 now: [Mouse: 1 pcs.]
           Customer 9 is queueing up in cash desk 1 now
      Customer 5 is being served in cash desk 1 now: [Mouse: 2 pcs., Monitor: 3 pcs., USB-drive: 1 pcs., USB-drive: 3 pcs.]
           Customer 10 is queueing up in cash desk 1 now
-> Cash Desk 3 is opening now <-
-> Cash Desk 4 is opening now <-
           Customer 11 is queueing up in cash desk 3 now
      Customer 11 is being served in cash desk 3 now: [Mouse: 3 pcs., USB-drive: 1 pcs., Mouse: 2 pcs.]
           Customer 12 is queueing up in cash desk 3 now
      Customer 8 is being served in cash desk 2 now: [Motherboard: 2 pcs.]
           Customer 13 is queueing up in cash desk 4 now
      Customer 13 is being served in cash desk 4 now: [Motherboard: 2 pcs., Case: 3 pcs., Keyboard: 2 pcs.]
      Customer 6 is being served in cash desk 1 now: [Motherboard: 3 pcs., Monitor: 1 pcs., CPU: 3 pcs., Motherboard: 3 pcs.]
           Customer 14 is queueing up in cash desk 4 now
           Customer 15 is queueing up in cash desk 3 now
      Customer 12 is being served in cash desk 3 now: [Motherboard: 1 pcs., Motherboard: 1 pcs., Monitor: 2 pcs., USB-drive: 3 pcs., CPU: 3 pcs.]
           Customer 16 is queueing up in cash desk 3 now
-> CashDesk 2 is closed <-
           Customer 17 is queueing up in cash desk 4 now
      Customer 14 is being served in cash desk 4 now: [Case: 1 pcs., Keyboard: 2 pcs., Motherboard: 3 pcs., CPU: 2 pcs.]
           Customer 18 is queueing up in cash desk 4 now
      Customer 9 is being served in cash desk 1 now: [Case: 3 pcs., Motherboard: 1 pcs., USB-drive: 3 pcs., Mouse: 1 pcs., Mouse: 1 pcs.]
-> Customer entrance is closed <-
      Customer 15 is being served in cash desk 3 now: [Monitor: 2 pcs., Motherboard: 1 pcs.]
      Customer 17 is being served in cash desk 4 now: [Mouse: 1 pcs., Monitor: 2 pcs., CPU: 1 pcs., CPU: 2 pcs.]
      Customer 10 is being served in cash desk 1 now: [Mouse: 3 pcs.]
      Customer 16 is being served in cash desk 3 now: [CPU: 1 pcs.]
      Customer 18 is being served in cash desk 4 now: [Monitor: 2 pcs.]
-> CashDesk 1 is closed <-
-> CashDesk 3 is closed <-
-> CashDesk 4 is closed <-

Process finished with exit code 0
*/