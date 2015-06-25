package jd02.port;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Berth implements Runnable{
    private int serviceTime = Util.generateRandomInt(100, 1000);

    @Override
    public void run() {
        // getNextShip....
    }


    public void serve(Ship ship, Storage storage) {
        if (ship.isLoaded()) {
            transfer(ship, storage);
        } else {
            transfer(storage, ship);
        }
    }

    private void transfer(Ship ship, Storage storage) {
        System.out.println("Выгрузка на склад");
    }

    private void transfer(Storage storage, Ship ship) {
        System.out.println("Загрузка в корабль");
    }

/*    public Lock getLock() {
        return lock;
    }*/

    public int getServiceTime() {
        return serviceTime;
    }
}
