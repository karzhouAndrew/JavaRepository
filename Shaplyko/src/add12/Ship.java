package add12;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ship extends Thread {
    private boolean reading = false;
    private BerthPool<Berth> pool;
    private int capacity;
    private Storage storageFrom;
    private Queue<Item> bodyStorage;
    private static int nextShip = 1;
    private int shipID = 0;

    public Ship(BerthPool<Berth> pool, int capacity, Storage stFrom) {
        this.shipID = nextShip++;
        this.pool = pool;
        this.bodyStorage = new ArrayDeque<Item>(capacity);
        this.capacity = capacity;
        this.storageFrom = stFrom;
    }

    public Ship(BerthPool<Berth> pool, Storage stFrom) {
        this.shipID = nextShip++;
        this.pool = pool;
        {
            this.bodyStorage = new ArrayDeque<Item>(3);
            Item[] goods = new Item[3];
            for (int i = 0; i < goods.length; i++) {
                goods[i] = new Item(i + 1);
                bodyStorage.add(goods[i]);
            }
        }
        this.storageFrom = stFrom;
    }

    public int getShipID() {
        return shipID;
    }

    public void run() {
        Berth Berth = null;
        try {
            Berth = pool.getResource(600);
            reading = true;
            System.out.println("Корабль №" + getShipID()
                    + " Использует причал №" + Berth.getBerthId());
            Berth.using();
            if (bodyStorage != null) {
                unloadShip();
            }
            loadShip();


        } catch (ResourсeException e) {
            System.out.println("Корабль №" + this.getId() + " потерял ->"
                    + e.getMessage());
        } finally {
            if (Berth != null) {
                reading = false;
                System.out.println("Корабль №" + getShipID()
                        + " закончил использование причала №" + Berth.getBerthId());
                pool.returnResource(Berth);

            }
        }
    }

    private void loadShip() {
        for (int i = 0; i < capacity; i++) {
            Item g = storageFrom.getGood();
            if (g == null) {
                return;
            }
            bodyStorage.add(g);
            System.out.println("Корабль № " + getShipID() + " загрузил товар №"
                    + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void unloadShip() {
        int size = bodyStorage.size();
        for (int i = 0; i < size; i++) {
            Item g = bodyStorage.poll();
            storageFrom.setGood(g);
            System.out.println("Корабль № " + getShipID() + " разгрузил товар №"
                    + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
