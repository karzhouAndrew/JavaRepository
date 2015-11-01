package jd02lab10;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerGen implements Runnable {

    private final String[] ON_SALE_GOODS = {"Mouse", "Keyboard", "Motherboard", "Monitor", "USB-drive", "CPU", "Case"};
    private final int MAX_ARTICLES_PER_CUSTOMER = 5;
    private final int MAX_EVERY_GOOD_QUANTITY = 3;
    private final PrintStream OUT;
    private final int SHOP_OPEN_PERIOD;
    private final int MIN_VISITOR_INTERVAL;

    private List<CashDesk> cashDesks;
    private int nextCustomerId = 1;
    private volatile boolean isOpen = true;

    public CustomerGen(int openPeriod, int minCustomerInterval, List<CashDesk> cashDesk, PrintStream out) {
        SHOP_OPEN_PERIOD = openPeriod;
        MIN_VISITOR_INTERVAL = minCustomerInterval;
        this.cashDesks = cashDesk;
        OUT = out;
    }

    @Override
    public void run() {
        long workStartTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - workStartTime < SHOP_OPEN_PERIOD) {
            Customer customer = new Customer(nextCustomerId++, generateGoodsList());
            CashDesk selectedCashDesk = cashDesks.get(findShortestQueue());
            synchronized (OUT) {
                OUT.println("           Customer " + customer.getId() + " is queueing up in cash desk " + selectedCashDesk.getNumber() + " now");
            }
            try {
                selectedCashDesk.getQueue().put(customer);
                Thread.sleep(MIN_VISITOR_INTERVAL);
            } catch (InterruptedException e) {
                synchronized (OUT) {
                    OUT.println(Thread.currentThread().getName() + " CustomerGen thread was interrupted.");
                }
                break;
            }
        }
        synchronized (OUT) {
            OUT.println("-> Customer entrance is closed <-");
        }
        setOpen(false);
    }

    private void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
        for (CashDesk currentCashDesk : cashDesks) {
            currentCashDesk.setOpen(isOpen);
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    private List<String> generateGoodsList() {
        Random rand = new Random();
        int currentCustomerGoods = rand.nextInt(MAX_ARTICLES_PER_CUSTOMER) + 1;
        List<String> goods = new ArrayList<>();
        for (int i = 0; i < currentCustomerGoods; i++) {
            String currentGood = ON_SALE_GOODS[rand.nextInt(ON_SALE_GOODS.length)];
            int currentQuantity = rand.nextInt(MAX_EVERY_GOOD_QUANTITY) + 1;
            goods.add(currentGood + ": " + currentQuantity + " pcs.");
        }
        return goods;
    }

    private int findShortestQueue() {
        int shortestQueueIndex = 0;
        int shortestSize = cashDesks.get(shortestQueueIndex).getQueue().size();
        for (int i = 0; i < cashDesks.size(); i++) {
            int currentQueueSize = cashDesks.get(i).getQueue().size();
            if (currentQueueSize < shortestSize) {
                shortestQueueIndex = i;
                shortestSize = currentQueueSize;
            }
        }
        return shortestQueueIndex;
    }
}
