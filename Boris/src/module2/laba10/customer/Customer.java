package module2.laba10.customer;


import module2.laba10.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int nextCustomer = 1;
    private int quantityProducts = (int) (Math.random() * 5);
    private List<Product> products;
    private final int id;

    public Customer() {
        products = new ArrayList<>();
        id = nextCustomer++;
        generateProducts(quantityProducts);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(String name, double price) {
        addProduct(new Product(name, price));
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return products.isEmpty() ? ("\nCustomer #" + id + " hasn't have products.")
                : ("\nCustomer #" + id + " has products:\n" + getProducts().toString());
    }

    private void generateProducts(int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(Product.generateNewProduct());
        }
    }

}
