package jd02.lab10;

public class Market {

    public void init(CustomersQueue customersQueue) {

        Runnable cashier1 = new Cashier(2000, customersQueue.getNextCustomer());
        Thread thread1 = new Thread(cashier1);
        //thread1.start();

        Runnable cashier2 = new Cashier(1000, customersQueue.getNextCustomer());
        Thread thread2 = new Thread(cashier2);
        //thread2.start();

        while (!customersQueue.isEmpty()) {
            thread1.start();
            thread2.start();
        }
    }
}
