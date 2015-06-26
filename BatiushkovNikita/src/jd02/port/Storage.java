package jd02.port;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {
    private static final Storage INSTANCE = new Storage();
    private int capacity;
    private Lock lock;

    private Storage() {
        this.lock = new ReentrantLock();
    }

    public static Storage getInstance() {
        return INSTANCE;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public Lock getLock() {
        return lock;
    }


    /*    public void connect() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            connections++;
            System.out.println(Thread.currentThread().getName());
            System.out.println("Current connections: " + connections);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            connections--;
        }

        semaphore.release();
    }*/
}
