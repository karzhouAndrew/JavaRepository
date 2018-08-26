package jd02.lab10;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Market assortment = new Market();
    private List<Product> shoppingCart = new ArrayList<>();

    public Customer(int productsQuantity) {
        generateShoppingCart(productsQuantity);
    }

    public void generateShoppingCart(int productsQuantity) {
        for (int i = 0; i < productsQuantity; i++) {
            shoppingCart.add(assortment.getRandomProduct());
        }
    }

    public void viewProducts() {
        for (Product product : shoppingCart) {
            System.out.println(product);
        }
    }
}
