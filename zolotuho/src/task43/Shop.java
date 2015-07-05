package task43;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Shop {
    private ProductsMonitor productsMonitor;
    private List<CashDesk> cashDesks;

    public Shop(ProductsMonitor productsMonitor, List<CashDesk> cashDesk) {
        this.productsMonitor = productsMonitor;
        this.cashDesks = cashDesk;
    }

    public Shop() {
        productsMonitor = new ProductsMonitor();
        cashDesks = new ArrayList<CashDesk>();
    }

    public Shop(ProductsMonitor productsMonitor, int cashDeskQuantity) {
        this.productsMonitor = productsMonitor;
        cashDesks = new ArrayList<CashDesk>();
        for (int i = 0; i < cashDeskQuantity; i++) {
            cashDesks.add(new CashDesk());
            cashDesks.get(i).setShop(this);
        }
    }

    public ProductsMonitor getProductsMonitor() {
        return productsMonitor;
    }

    public void setProductsMonitor(ProductsMonitor productsMonitor) {
        this.productsMonitor = productsMonitor;
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

    public void subtractProductsFromShop(ProductsMonitor productsMonitor) {
        this.productsMonitor.subtractProducts(productsMonitor);
    }

    public void addProductsToShop(ProductsMonitor productsMonitor) {
        this.productsMonitor.addProducts(productsMonitor);
    }

    private void distributeClients(ClientsMainQueue clientsMainQueue) {
        int estimatedQueueLength = clientsMainQueue.getShoppingBaskets().size() / cashDesks.size();
        int[] queueLengths = new int[cashDesks.size()];
        for (int i = 0; i < queueLengths.length - 1; i++) {
            queueLengths[i] = estimatedQueueLength;
        }
        queueLengths[queueLengths.length - 1] = clientsMainQueue.getShoppingBaskets().size() - estimatedQueueLength * (queueLengths.length - 1);
        int sum = 0;
        for (int i = 0; i < queueLengths.length; i++) {
            int startPosition = sum;
            sum += queueLengths[i];
            for (int j = startPosition; j < sum; j++) {
                cashDesks.get(i).getClientsMainQueue().addClient(clientsMainQueue.getShoppingBaskets().get(j));
            }
        }
    }

    public void work(ClientsMainQueue clientsMainQueue) {
        distributeClients(clientsMainQueue);
        ExecutorService executor = Executors.newFixedThreadPool(cashDesks.size());
        for (int i = 0; i < cashDesks.size(); i++) {
            executor.execute(cashDesks.get(i));
        }
        executor.shutdown();
    }
}
