package module2.addShip.mooring;


import module2.addShip.ship.Ship;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mooring {
    private static final int THREADS = 10;
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

    public void moor(final Ship ship){
        pool.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
