package module2.laba10.customer;


import module2.laba10.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int nextCustomer = 1;
    private int quantityProducts = (int) (Math.random() * 5);
    private List<Product> products;
    private int id;

    public Customer() {
        products = new ArrayList<>();
        this.id = nextCustomer++;
        generateProducts(quantityProducts);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(String name, double price) {
        addProduct(new Product(name, price));
    }

    public List<Product> getProducts() throws NullPointerException {
        return products;
    }

    @Override
    public String toString() {
        return products == null ? ("\nCustomer #" + id + " hasn't have products.")
                : ("\nCustomer #" + id + " have products:\n" + getProducts().toString());
    }

    private void generateProducts(int quantity) {
        if (quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                products.add(Product.generateNewProduct());
            }
        } else {
            products = null;
        }
    }
}
