package task43;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Shop {
    private volatile Products products;
    private List<CashDesk> cashDesks;

    public Shop(Products products, List<CashDesk> cashDesk) {
        this.products = products;
        this.cashDesks = cashDesk;
    }

    public Shop() {
        products = new Products();
        cashDesks = new ArrayList<CashDesk>();
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public List<CashDesk> getCashDesks() {
        return cashDesks;
    }

    public void setCashDesks(List<CashDesk> cashDesks) {
        this.cashDesks = cashDesks;
    }

    public void setCashDesk(CashDesk cashDesk) {
        cashDesks.add(cashDesk);
    }

    public void subtractProductsFromShop(Products products) {
        this.products.subtractProducts(products);
    }

    public void addProductsToShop(Products products) {
        this.products.addProducts(products);
    }

    private void distributeClients(Clients clients) {
        int estimatedQueueLength = clients.getShoppingBaskets().size() / cashDesks.size();
        int[] queueLengths = new int[cashDesks.size()];
        for (int i = 0; i < queueLengths.length - 1; i++) {
            queueLengths[i] = estimatedQueueLength;
        }
        queueLengths[queueLengths.length - 1] = clients.getShoppingBaskets().size() - estimatedQueueLength * (queueLengths.length - 1);
        int sum = 0;
        for (int i = 0; i < queueLengths.length; i++) {
            int startPosition = sum;
            sum += queueLengths[i];
            for (int j = startPosition; j < sum; j++) {
                cashDesks.get(i).getClients().addClient(clients.getShoppingBaskets().get(j));
            }
        }
    }

    public void work(Clients clients) {
        distributeClients(clients);
        ExecutorService executor = Executors.newFixedThreadPool(cashDesks.size());
        for (int i = 0; i < cashDesks.size(); i++) {
            executor.execute(cashDesks.get(i));
        }
        executor.shutdown();
    }
}
