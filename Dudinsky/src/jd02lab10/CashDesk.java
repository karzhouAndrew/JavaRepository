package jd02lab10;

import java.io.PrintStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CashDesk implements Runnable {

    private final PrintStream OUT;
    private final int SERVICE_TIME = 1500;

    private int number;
    private BlockingQueue<Customer> queue = new LinkedBlockingQueue<>();
    private volatile boolean isOpen = true;

    public CashDesk(PrintStream out) {
        OUT = out;
    }

    @Override
    public void run() {
        while (!queue.isEmpty() || isOpen) {
            Customer nextCustomer;
            try {
                nextCustomer = queue.take();
                synchronized (OUT) {
                    OUT.print("      Customer " + nextCustomer.getId() + " is being served in cash desk " + number + " now: ");
                    OUT.println(nextCustomer.getGoods());
                }
                Thread.sleep(SERVICE_TIME);
            } catch (InterruptedException e) {
                isOpen = false;
                synchronized (OUT) {
                    OUT.println("-> CashDesk " + number + " is switching to closing mode now <-");
                }
            }
        }
        synchronized (OUT) {
            OUT.println("-> CashDesk " + number + " is closed <-");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BlockingQueue<Customer> getQueue() {
        return queue;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
