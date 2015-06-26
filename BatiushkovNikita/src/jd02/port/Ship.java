package jd02.port;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ship {
    private int capacity = Util.generateRandomInt(10, 50);
    private boolean loaded = Util.generateRandomBool();
    //private Lock lock;

    public Ship() {

    }

    public Ship(int capacity, Boolean loaded) {
        this.loaded = loaded;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "initialCapacity=" + capacity +
                ", loaded=" + loaded +
                '}';
    }
}
