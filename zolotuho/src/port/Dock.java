package port;

import java.util.concurrent.TimeUnit;

public class Dock implements Runnable {
    private ShipGenerator shipQueue;
    private Store store;
    private int timeLoading;

    public Dock(ShipGenerator shipQueue, Store store, int timeLoading) {
        this.shipQueue = shipQueue;
        this.store = store;
        this.timeLoading = timeLoading;
    }

    public int getTimeLoading() {
        return timeLoading;
    }

    public void setTimedLoading(int timeLoading) {
        this.timeLoading = timeLoading;
    }

    @Override
    public void run() {
        serveShips();
    }

    private void serveShips() {
        Ship servedShip = null;
        Thread currentTread = Thread.currentThread();
        while (!currentTread.isInterrupted()) {
            if (!shipQueue.getShips().isEmpty()) {
                try {
                    servedShip = shipQueue.getShip();
                } catch (InterruptedException e) {
                    System.out.println("Dock closed");
                    return;
                }
                loadProcedure(servedShip);
                System.out.println(Thread.currentThread().getName() + " " + servedShip);
            }
        }
        System.out.println("Dock closed");
    }

    private void loadProcedure(Ship servedShip) {
        try {
            if (servedShip.isUnload() == false) {
                int freeSpaceInShip = servedShip.getCapacity() - servedShip.getContainerQuantity();
                store.obtainFromStore(freeSpaceInShip);
                servedShip.setContainerQuantity(servedShip.getCapacity());
            } else {
                store.putInStore(servedShip.getContainerQuantity());
                servedShip.setContainerQuantity(0);
                TimeUnit.MILLISECONDS.sleep(timeLoading);
            }
        } catch (InterruptedException e) {
            System.out.println("Dock interruption");
        }
    }
}



