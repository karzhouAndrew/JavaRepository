package jd02.lab10;

import java.util.ArrayDeque;
import java.util.Deque;

public class CustomersQueue {
    private int queueSize;
    private Deque<Customer> customers = new ArrayDeque<>(queueSize);

    public CustomersQueue(int queueSize) {
        this.queueSize = queueSize;
        generateCustomersQueue();
    }

    public void generateCustomersQueue() {
        for (int i = 0; i < queueSize; i++) {
            customers.add(new Customer((int) (Math.random() * 10 + 1)));
        }
    }

    public synchronized Customer getNextCustomer() {
        return customers.pop();
    }

    public synchronized boolean isEmpty() {
        return customers.isEmpty();
    }
}
