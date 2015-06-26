package task43;

import java.util.ArrayList;
import java.util.List;

public class Clients {
    private List<Products> shoppingBaskets;

    public Clients(List<Products> shoppingBaskets) {
        this.shoppingBaskets = shoppingBaskets;
    }

    public void addClient(Products products) {
        shoppingBaskets.add(products);
    }

    public Clients() {
        shoppingBaskets = new ArrayList<>();
    }

    public List<Products> getShoppingBaskets() {
        return shoppingBaskets;
    }

    public Products getShoppingBasket(int clientNumber) {
        return shoppingBaskets.get(clientNumber);
    }

    public void setShoppingBaskets(List<Products> shoppingBaskets) {
        this.shoppingBaskets = shoppingBaskets;
    }
}
