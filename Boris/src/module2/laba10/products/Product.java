package module2.laba10.products;


public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + name +
                " - " + price;
    }

    public static Product generateNewProduct() {
        int enumNumber = (int) (Math.random() * OrderProduct.values().length);
        OrderProduct orderProduct = OrderProduct.values()[enumNumber];
        return new Product(orderProduct.getName(), orderProduct.getPrice());
    }
}
