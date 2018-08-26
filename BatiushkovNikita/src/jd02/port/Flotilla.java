package jd02.port;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;

public class Flotilla {
    private Queue<Ship> shipsQueue = new LinkedList<>();

    public Flotilla(int queueSize) {
        generateShipsQueue(queueSize);
    }

    private void generateShipsQueue(int queueSize) {
        for (int i = 0; i < queueSize; i++) {
            shipsQueue.add(new Ship());
        }
    }

    public Ship getNextShip() {
        return shipsQueue.poll();
    }

    public boolean isEmpty() {
        return shipsQueue.isEmpty();
    }
}
