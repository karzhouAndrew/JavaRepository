package port;

import java.util.concurrent.atomic.AtomicInteger;

public class Store {
    private AtomicInteger remainedCapacity = new AtomicInteger();
    private int capacity;

    public Store(int capacity) {
        this.capacity = capacity;
        remainedCapacity.set(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public synchronized void setRemainedCapacity(int capacity) {
        this.remainedCapacity.set(capacity);
    }

    public synchronized int getRemainedCapacity() {
        return remainedCapacity.get();
    }

    public synchronized void putInStore(int units) throws InterruptedException {
        while (remainedCapacity.get() < units) {
            this.wait();
        }
        remainedCapacity.addAndGet(-units);
        this.notifyAll();
    }

    public synchronized int obtainFromStore(int units) throws InterruptedException {
        while (capacity - remainedCapacity.get() < units) {
            this.wait();
        }
        remainedCapacity.addAndGet(units);
        this.notifyAll();
        return units;
    }

    @Override
    public String toString() {
        return "Store{" +
                "remainCapacity=" + remainedCapacity +
                '}';
    }
}