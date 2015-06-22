package module2.laba10.customer;


import module2.laba10.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer implements SeeCustomer {
    private static int nextCustomer = 1;

    private List<Product> products;
    private int id;

    public Customer() {
        products = new ArrayList<>();
        this.id = nextCustomer++;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(String name, double price) {
        addProduct(new Product(name, price));
    }

    public List<Product> getProducts() throws NullPointerException {
        if (products.isEmpty()) {
            throw new NullPointerException();
        }
        return products;
    }

    @Override
    public String toString() {
        String productsOrder;
        try {
            productsOrder = getProducts().toString();
        } catch (NullPointerException e) {
            productsOrder = "Products are missing.";
        }
        return "\nCustomer #" + id + " have products:\n" + productsOrder;
    }

    public void generateProducts(int quantity) {
        if (quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                products.add(Product.generateNewProduct());
            }
        } else {
            products = null;
        }
    }

    @Override
    public Customer getCustomer() {
        return this;
    }
}
