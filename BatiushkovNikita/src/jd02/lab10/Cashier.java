package jd02.lab10;

public class Cashier implements Runnable {
    private int serviceTime;
    private Customers customers;

    public Cashier(int delay, Customers customers) {
        this.serviceTime = delay;
        this.customers = customers;
    }

    @Override
    public void run() {
        while (!customers.isEmpty()) {
            serve(customers.getNextCustomer());
        }
    }

    public void serve(Customer customer) {
        try {
            Thread.sleep(serviceTime);
            System.out.println(Thread.currentThread().getName());
            customer.viewProducts();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
