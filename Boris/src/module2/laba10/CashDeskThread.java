package module2.laba10;


import module2.laba10.customer.SeeCustomer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CashDeskThread {
    private static CashDeskThread instance;
    private static final int POOLS = 10;

    private CashDeskThread() {

    }

    public static CashDeskThread getInstance() {
        if (instance == null) {
            instance = new CashDeskThread();
            return instance;
        }
        return instance;
    }

    public void work(final SeeCustomer customer) {
        ExecutorService poolThreads;
        synchronized (customer) {
            poolThreads = Executors.newFixedThreadPool(POOLS);
            poolThreads.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(customer.getCustomer() + "\n");
                }
            });
        }
        poolThreads.shutdown();
    }
}
