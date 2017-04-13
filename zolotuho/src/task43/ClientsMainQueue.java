package task43;

import java.util.ArrayList;
import java.util.List;

public class ClientsMainQueue {
    private List<ProductsMonitor> shoppingBaskets;

    public ClientsMainQueue(List<ProductsMonitor> shoppingBaskets) {
        this.shoppingBaskets = shoppingBaskets;
    }

    public void addClient(ProductsMonitor productsMonitor) {
        shoppingBaskets.add(productsMonitor);
    }

    public ClientsMainQueue() {
        shoppingBaskets = new ArrayList<>();
    }

    public List<ProductsMonitor> getShoppingBaskets() {
        return shoppingBaskets;
    }

    public ProductsMonitor getShoppingBasket(int clientNumber) {
        return shoppingBaskets.get(clientNumber);
    }

    public void setShoppingBaskets(List<ProductsMonitor> shoppingBaskets) {
        this.shoppingBaskets = shoppingBaskets;
    }
}
