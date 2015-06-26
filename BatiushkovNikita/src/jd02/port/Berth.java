package jd02.port;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Berth implements Runnable {
    private int serviceTime = Util.generateRandomInt(500, 1000);
    private Ship currentShip;
    //private Storage storage = Storage.getInstance();
    private Storage2 storage = Storage2.getInstance();

    public Berth(Ship currentShip) {
        this.currentShip = currentShip;
    }

    @Override
    public void run() {
/*        try {
            if (storage.getLock().tryLock(1, TimeUnit.SECONDS)) {*/
                storage.serve(currentShip);
/*            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            storage.getLock().unlock();
        }*/
    }

/*    public void serve(Ship ship) {
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
    }

    private void transferFromShipToStorage(Ship ship) {
        int shipCapacity = ship.getCapacity();
        int storageCapacity = storage.getCapacity() + shipCapacity;
        storage.setCapacity(storageCapacity);
        System.out.println("Загружено на склад: " + shipCapacity);
        System.out.println("Остаток на складе: " + storageCapacity);
        System.out.println();
    }

    private void transferFromStorageToShip(Ship ship) {
        int shipCapacity = ship.getCapacity();
        int storageCapacity = storage.getCapacity() - shipCapacity;
        storage.setCapacity(storageCapacity);
        System.out.println("Загружено на корабль " + shipCapacity);
        System.out.println("Остаток на складе: " + storageCapacity);
        System.out.println();
    }*/
}
