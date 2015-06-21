package addLab10;


public class Car {
    private String brand;
    private String model;
    private int productionYear;
    private int price;

    public Car() {
    }

    public Car(String brand, String model, int productionYear, int price) {
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.productionYear = productionYear;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (productionYear != car.productionYear) return false;
        if (!brand.equals(car.brand)) return false;
        if (!model.equals(car.model)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + productionYear;
        result = 31 * result + price;
        return result;
    }
}
