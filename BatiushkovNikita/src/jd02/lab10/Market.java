package jd02.lab10;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private List<Product> products = new ArrayList<>();

    public Market() {
        generateAssortment();
    }

    public void generateAssortment() {
        products.add(new Product("Milk", 10));
        products.add(new Product("Burger", 6));
        products.add(new Product("Beef", 19));
        products.add(new Product("Pork", 74));
        products.add(new Product("Candies", 7));
        products.add(new Product("Durum", 16));
        products.add(new Product("Spelt", 18));
        products.add(new Product("Eggs", 17));
        products.add(new Product("Farina", 43));
        products.add(new Product("Pastas", 122));
        products.add(new Product("Rice", 89));
        products.add(new Product("Corn", 56));
        products.add(new Product("Orange", 83));
        products.add(new Product("Fries", 51));
        products.add(new Product("Cheese", 90));
    }

    public Product getRandomProduct() {
        return products.get((int) (Math.random() * products.size()));
    }
}
