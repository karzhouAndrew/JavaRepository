package ships;

import java.util.Queue;

/**
 * Created by champion on 27.06.15.
 */
public class Port implements Runnable {
    private Thread thread;
    private int prichalNumber;
    public static final int MAX_CONTAINERS_NUMBER = 100;
    public static int containersCounter = 50;
    private boolean isFree = true;
    private Queue<Ship> ships;

    public Port(int prichalNumber, Queue<Ship> ships) {
        thread = new Thread(this);
        this.prichalNumber = prichalNumber;
        this.ships=ships;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    @Override
    public void run() {
        while (true) {
            Ship ship = keepShip();
            if (ship == null) {
                return;
            }
            try {
                if (ship.getConteinersNumber() > 0) {
                    System.out.println("Корабль " + ship.getShipName() + " (выгружаем)");
                    //выгружаем
                    for (int i = ship.getConteinersNumber(); i > 0; i--) {
                        if (containersCounter < MAX_CONTAINERS_NUMBER) {
                            containersCounter++;
                            System.out.println("Выгружаем корабль №" + ship.getShipName() + " : " + i+" контейнеров ; Количество контейнеров на складе "+containersCounter);
                            Thread.sleep(100);
                        } else {
                            System.out.println("В порту больше нет места, приостанавливаем поток");
                            while(containersCounter == MAX_CONTAINERS_NUMBER) {
                                thread.sleep(1000);
                            }
                        }
                    }
                } else {
                    System.out.println("Корабль "+ship.getShipName()+" (загружаем)");
                    //загружаем
                    for (int i = 0; i < 20; i++) {
                        if (containersCounter > 0) {
                            containersCounter--;
                            System.out.println("Загружаем корабль №" + ship.getShipName() + " : " + i+" контейнеров ; Количество контейнеров на складе "+containersCounter);
                            Thread.sleep(100);
                        } else {
                            System.out.println("Порт пустой, приостонавливаем выполнение потока");
                            while(containersCounter == 0) {
                                thread.sleep(1000);
                            }
                        }
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        System.out.println("start");
        thread.start();
    }

    private Ship keepShip(){
        Ship ship = null;
        synchronized (ships) {
            ship = ships.poll();
        }
        return ship;
    }

}
