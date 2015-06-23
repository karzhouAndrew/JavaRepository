package jd02.lab10;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int quantity;
    private List<Product> shoppingCart = new ArrayList<>();

    Assortment assortment = new Assortment();

    public Customer(int quantity) {
        this.quantity = quantity;
        generateShoppingCart();
    }

    public void generateShoppingCart() {
        for (int i = 0; i < quantity; i++) {
            shoppingCart.add(assortment.getRandomProduct());
        }
    }

    public void viewProducts() {
        for (Product product : shoppingCart) {
            System.out.println(product);
        }
    }
}
