package jd02.lab10;

public class Cashier implements Runnable {
    private int delay;
    private Customer currentCustomer;

    public Cashier(int delay, Customer currentCustomer) {
        this.delay = delay;
        this.currentCustomer = currentCustomer;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName());
            currentCustomer.viewProducts();
            System.out.println("---------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
