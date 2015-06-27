package task43;

public class CashDesk implements Runnable {
    private Clients clients;
    private Shop shop;

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < clients.getShoppingBaskets().size(); i++) {
            synchronized (shop.getProducts()) {
                shop.subtractProductsFromShop(handleClient(clients, i));
            }
            System.err.println(clients.getShoppingBasket(i) + "  " + thread.getName() + "  " + shop.getProducts());
        }
    }

    public CashDesk(Clients clients) {
        this.clients = clients;
    }

    public CashDesk() {
        this.clients = new Clients();
    }

    public Products handleClient(Clients clients, int clientNumber) {
        return clients.getShoppingBaskets().get(clientNumber);
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }
}
