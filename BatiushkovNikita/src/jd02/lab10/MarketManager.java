package jd02.lab10;

public class MarketManager {
    private CustomersQueue customersQueue;

    private final int CASHIER1_SERVICE_TIME = 50;
    private final int CASHIER2_SERVICE_TIME = 400;
    private final int CASHIER3_SERVICE_TIME = 500;
    private final String CASHIER1_NAME = "CASHIER №1";
    private final String CASHIER2_NAME = "CASHIER №2";
    private final String CASHIER3_NAME = "CASHIER №3";

    public MarketManager(CustomersQueue customersQueue) {
        this.customersQueue = customersQueue;
    }

    public void startCashiers() {
        createCashier(CASHIER1_SERVICE_TIME, CASHIER1_NAME).start();
        createCashier(CASHIER2_SERVICE_TIME, CASHIER2_NAME).start();
        createCashier(CASHIER3_SERVICE_TIME, CASHIER3_NAME).start();
    }

    public Thread createCashier(final int serviceTime, String name) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!customersQueue.isEmpty()) {
                    serve(customersQueue.getNextCustomer(), serviceTime);
                }
            }
        });
        thread.setName(name);
        return thread;
    }

    public void serve(Customer customer, int serviceTime) {
        try {
            Thread.sleep(serviceTime);
            System.out.println(Thread.currentThread().getName());
            customer.viewProducts();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
