package module2.SeaPort.mooring;


import module2.SeaPort.LoadUnloadBox.LoadUnloadBox;
import module2.SeaPort.ship.Ship;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mooring {
    private static final int THREADS = 2;
    private static Mooring mooring;
    private static ExecutorService pool;

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
//        synchronized (ship) {
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ship start " + Thread.currentThread().getName());
                LoadUnloadBox.start(ship);
                System.out.println("Ship Finish " + Thread.currentThread().getName());
            }
        });
        if (!ship.isEmpty()) {
            System.out.println("Return ship. " + Thread.currentThread().getName());
            moor(ship);
        }
//        }
    }

    public void shutdown() {
        while (!pool.isTerminated()) {
            pool.shutdown();
        }
        System.out.println("Goodbye.");
    }
}
