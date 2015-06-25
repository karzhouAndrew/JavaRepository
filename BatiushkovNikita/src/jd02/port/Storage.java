package jd02.port;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class Storage {
    private static Storage instance = new Storage();

    private Semaphore semaphore = new Semaphore(1);

    private int connections = 0;

    private Storage() {
    }

    public static Storage getInstance() {
        return instance;
    }

    public void service() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        semaphore.release();
    }


}
