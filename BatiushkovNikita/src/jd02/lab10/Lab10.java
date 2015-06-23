package jd02.lab10;
/*
Напишите программу, моделирующую кассы в магазине.
Существует несколько касс, работающих одновременно.
Общее количество покупа-телей может быть больше чем количество касс,
но одновременно не мо-жет обрабатываться больше покупателей, чем имеется рабочих касс.
У каждого покупателя есть набор товаров, которые  должны быть выведены  в процессе обслуживания.
*/

public class Lab10 {
    public static void main(String[] args) throws InterruptedException {
        CustomersQueue customersQueue = new CustomersQueue(10);


        Market market = new Market();
        market.init(customersQueue);
    }
}
