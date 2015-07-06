package port;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ShipGenerator implements Runnable {
    private BlockingQueue<Ship> ships;
    private int capacity;
    private int generatingTime;
    private boolean isGenerate;

    public ShipGenerator() {
        ships = new LinkedBlockingQueue<>(50);
        capacity = 100;
        generatingTime = 0;
        isGenerate = true;
    }

    public ShipGenerator(int lengthShipsQueue, int capacity, int generatingTime) {
        ships = new LinkedBlockingQueue<>(lengthShipsQueue);
        this.capacity = capacity;
        this.generatingTime = generatingTime;
        isGenerate = true;
    }

    public void generateShips(int quantity, int capacity, int unit, boolean loadingMode) {
        for (int i = 0; i < quantity; i++) {
            ships.add(new Ship(capacity, unit, loadingMode));
        }
    }

    public void generateShips(int quantity, int capacity) {
        Random rand = new Random();
        for (int i = 0; i < quantity; i++) {
            ships.add(new Ship(capacity, rand.nextInt(capacity), rand.nextBoolean()));
        }
    }

    public void generateShips(int capacity, int unit, boolean loadingMode) {
        while (isGenerate) {
            ships.add(new Ship(capacity, unit, loadingMode));
            try {
                TimeUnit.MILLISECONDS.sleep(generatingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "  " + ships.remainingCapacity());
        }
    }

    public void generateRandomShips(int capacity) {
        Random rand = new Random();
        while (isGenerate) {
            try {
                ships.put(new Ship(capacity, rand.nextInt(capacity), rand.nextBoolean()));
                TimeUnit.MILLISECONDS.sleep(generatingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "  " + ships.remainingCapacity());
        }
    }

    public boolean isGenerate() {
        return isGenerate;
    }

    public void setGenerate(boolean isGenerated) {
        this.isGenerate = isGenerated;
    }

    public Ship getShip() throws InterruptedException {
        return ships.take();
    }

    public Ship seeShip() throws InterruptedException {
        return ships.peek();
    }

    public BlockingQueue<Ship> getShips() {
        return ships;
    }

    public void setShips(BlockingQueue<Ship> ships) {
        this.ships = ships;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        thread.setName("Ship");
        ShipGenerator generator = this;
        generator.generateRandomShips(capacity);
    }
}
