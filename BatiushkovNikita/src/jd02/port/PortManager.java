package jd02.port;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PortManager {
    private Flotilla flotilla;
    private int berthsQuantity;

    public PortManager(Flotilla flotilla, int berthsQuantity) {
        this.flotilla = flotilla;
        this.berthsQuantity = berthsQuantity;
    }

    public void startRegulation() {
        ExecutorService executor = Executors.newFixedThreadPool(berthsQuantity);
        while (!flotilla.isEmpty()) {
            Ship ship = flotilla.getNextShip();
            Runnable berth = new Berth(ship);
            executor.submit(berth);
        }
        executor.shutdown();
        //executor.awaitTermination(1, TimeUnit.SECONDS);
    }
}
