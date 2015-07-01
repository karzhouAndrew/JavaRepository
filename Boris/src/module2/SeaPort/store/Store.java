package module2.SeaPort.store;


import module2.SeaPort.box.Box;
import module2.SeaPort.store.exception.EmptyStoreException;
import module2.SeaPort.store.exception.FullStoreException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private static Store store;
    private List<Box> boxesOnStore;
    private final static int maxCapacity = 10;
    private Lock lock = new ReentrantLock();

    private Store() {
        boxesOnStore = new ArrayList<>();
    }

    public synchronized static Store getStore() {
        if (store == null) {
            store = new Store();
        }
        return store;
    }

    public void addBox(Box box) {
        if (boxesOnStore.size() < maxCapacity) {
            if (lock.tryLock()) {
                boxesOnStore.add(box);
                lock.unlock();
            }
        } else {
            throw new FullStoreException();
        }
    }

    public Box removeBox() {

        if (boxesOnStore.isEmpty()) {
            throw new EmptyStoreException();
        } else {
            Box box = boxesOnStore.get(boxesOnStore.size() - 1);
            if (lock.tryLock()) {
                boxesOnStore.remove(boxesOnStore.size() - 1);
                lock.unlock();
            }
            return box;
        }
    }

    public int getCapacity() {
        return boxesOnStore.size();
    }

}
