package cashbox;

import java.util.Queue;

/**
 * Created by champion on 25.06.15.
 */
public class CashBox implements Runnable {
    private Thread thread;
    private Queue<Buyer> queue;

    public CashBox(Queue<Buyer> queue) {
        thread = new Thread(this);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Buyer buyer = keepBuyer();
            if (buyer == null) {
                return;
            }
            try {
                for (Goods goods : buyer.getGoods()) {
                    System.out.println("Покупатель №" + buyer.getName() + "; " + goods.toString());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        thread.start();
    }

    private Buyer keepBuyer() {
        Buyer buyer = null;
        synchronized (queue) {
            buyer = queue.poll();
        }
        return buyer;
    }
}
