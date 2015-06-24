package jd02.lab10;

public class Market {
    public void createCashiersThreads(Customers customers) {
        int serviceTimeCashier1 = 0;
        int serviceTimeCashier2 = 0;
        int serviceTimeCashier3 = 0;

        Thread thread1 = new Thread(new Cashier(serviceTimeCashier1, customers));
        thread1.setName("CASHIER №1");
        thread1.start();

        Thread thread2 = new Thread(new Cashier(serviceTimeCashier2, customers));
        thread2.setName("CASHIER №2");
        thread2.start();

        Thread thread3 = new Thread(new Cashier(serviceTimeCashier3, customers));
        thread3.setName("CASHIER №3");
        thread3.start();
    }
}
