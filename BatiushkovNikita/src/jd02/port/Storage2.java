package jd02.port;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage2 {
    private static final Storage2 INSTANCE = new Storage2();
    private int capacity;
    private int serviceTime = 600;
    Semaphore semaphore = new Semaphore(1);


    private Storage2() {
    }

    public static Storage2 getInstance() {
        return INSTANCE;
    }

    public void serve(Ship ship) {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(serviceTime);
            if (ship.isLoaded()) {
                transferFromShipToStorage(ship);
            } else {
                transferFromStorageToShip(ship);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();

    }

    private void transferFromShipToStorage(Ship ship) {
        int shipCapacity = ship.getCapacity();
        int storageCapacity = getCapacity() + shipCapacity;
        setCapacity(storageCapacity);
        System.out.println("Загружено на склад: " + shipCapacity);
        System.out.println("Остаток на складе: " + storageCapacity);
        System.out.println();
    }

    private void transferFromStorageToShip(Ship ship) {
        int shipCapacity = ship.getCapacity();
        int storageCapacity = getCapacity() - shipCapacity;
        setCapacity(storageCapacity);
        System.out.println("Загружено на корабль " + shipCapacity);
        System.out.println("Остаток на складе: " + storageCapacity);
        System.out.println();
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}

