package module2.SeaPort.mooring;


import module2.SeaPort.LoadUnloadBox.LoadUnloadBox;
import module2.SeaPort.ship.Ship;

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
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Ship start " + Thread.currentThread().getName());
                LoadUnloadBox.start(ship);
                System.out.println("Ship Finish " + Thread.currentThread().getName());
            }
        };
        pool.execute(thread);
        System.out.println("Next please.");
    }

    public void shutdown() {
        while (!pool.isTerminated()) {
            pool.shutdown();
        }
        System.out.println("Goodbye.");
    }
}
