package task43;

public class CashDesk implements Runnable {
    private ClientsMainQueue clientsMainQueue;
    private Shop shop;

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < clientsMainQueue.getShoppingBaskets().size(); i++) {
            synchronized (shop.getProductsMonitor()) {
                shop.subtractProductsFromShop(handleClient(clientsMainQueue, i));
            }
            System.err.println(clientsMainQueue.getShoppingBasket(i) + "  " + thread.getName() + "  " + shop.getProductsMonitor());
        }
    }

    public CashDesk(ClientsMainQueue clientsMainQueue) {
        this.clientsMainQueue = clientsMainQueue;
    }

    public CashDesk() {
        this.clientsMainQueue = new ClientsMainQueue();
    }

    public ProductsMonitor handleClient(ClientsMainQueue clientsMainQueue, int clientNumber) {
        return clientsMainQueue.getShoppingBaskets().get(clientNumber);
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public ClientsMainQueue getClientsMainQueue() {
        return clientsMainQueue;
    }

    public void setClientsMainQueue(ClientsMainQueue clientsMainQueue) {
        this.clientsMainQueue = clientsMainQueue;
    }
}
