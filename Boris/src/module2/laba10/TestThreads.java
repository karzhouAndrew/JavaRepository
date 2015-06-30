package module2.laba10;


import module2.laba10.customer.Customer;

//Напишите программу, моделирующую кассы в магазине. Существу-ет несколько касс, работающих одновременно.
//        Общее количество покупа-телей может быть больше чем количество касс, но одновременно не может
//        обрабатываться больше покупателей, чем имеется рабочих касс. У каждого покупателя есть набор
//        товаров, которые  должны быть выведены  в процессе обслуживания.


public class TestThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Customer customer = new Customer();
            CashDeskThread.getInstance().work(customer);
        }
        CashDeskThread.getInstance().shutdown();
    }
}
