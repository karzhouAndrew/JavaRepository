package lab43;

import java.util.List;

/**
 * Created by Master on 23.06.2015.
 */
public class CashDesk implements Runnable {
    private List<CustomerGoods> listCustomer;
    private String name;

    public CashDesk() {
    }

    public CashDesk(String name) {
        this.name = name;
    }

    public void setListCustomer(List<CustomerGoods> listCustomer) {
        this.listCustomer = listCustomer;
    }

    synchronized public void printListGoods(List<CustomerGoods> listCustomer) {
        StringBuilder check = new StringBuilder();
        int sum = 0;
        for (CustomerGoods customerGoods : listCustomer) {
            check.append(customerGoods.getGoods().getName() + "    " + customerGoods.getGoods().getPrice() + "     " + customerGoods.getCount() + "     " + customerGoods.getCount() * customerGoods.getGoods().getPrice() + "\n");
            sum += customerGoods.getCount() * customerGoods.getGoods().getPrice();
        }
        System.out.println(name + "\n" +
                "Товар   Цена  Кол  Сумма" + "\n" +
                check +
                "Общая сумма " + sum);
        System.out.println();
    }

    public void run() {
        printListGoods(listCustomer);
    }
}
