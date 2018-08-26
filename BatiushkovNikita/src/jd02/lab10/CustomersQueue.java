package jd02.lab10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class CustomersQueue {
    private Queue<Customer> customers = new ArrayDeque<>();

    public CustomersQueue(int queueSize) {
        generateCustomersQueue(queueSize);
    }

    public void generateCustomersQueue(int queueSize) {
        for (int i = 0; i < queueSize; i++) {
            customers.add(new Customer((int) (Math.random() * 10 + 1)));
        }
    }

    public synchronized Customer getNextCustomer() {
        return customers.poll();
    }

    public synchronized boolean isEmpty() {
        return customers.isEmpty();
    }
}
