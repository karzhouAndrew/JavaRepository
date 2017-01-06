package module2.SeaPort.mooring;


import module2.SeaPort.LoadUnloadBox.LoadUnloadBox;
import module2.SeaPort.ship.Ship;
import module2.SeaPort.store.exception.EmptyStoreException;
import module2.SeaPort.store.exception.FullStoreException;
import module2.SeaPort.store.exception.StoreException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mooring {
    private static final int THREADS = 5;
    private static Mooring mooring;
    private static ExecutorService pool;
    private static int quantity = 1;

    private Mooring() {
        pool = Executors.newFixedThreadPool(THREADS);
    }

    public synchronized static Mooring getMooring() {
        if (mooring == null) {
            mooring = new Mooring();
        }
        return mooring;
    }

    public void moor(final Ship ship) {
        System.out.println(quantity++);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ship start " + Thread.currentThread().getName());
                try {
                    LoadUnloadBox.start(ship);
                } catch (StoreException e) {
                    System.out.println("Store is full or empty.");
                    returnShip(ship);
                }
            }
        });
        System.out.println("Next please.");
    }

    private void returnShip(final Ship ship) {
        Thread returnShip = new Thread() {
            @Override
            public void run() {
                moor(ship);
                System.out.println("Return ship.");
            }
        };
        returnShip.start();
    }

    public void shutdown() {
        while (!pool.isTerminated()) {
            pool.shutdown();
        }
        System.out.println("Goodbye.");
    }
}
