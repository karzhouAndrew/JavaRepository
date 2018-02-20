package add10;

public class Car {
    private String brand;
    private String model;
    private int graduationYear;
    private int price;

    public Car() {
    }

    public Car(String brand, String model, int graduationYear, int price) {
        this.brand = brand;
        this.model = model;
        this.graduationYear = graduationYear;
        this.price = price;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (graduationYear != car.graduationYear) return false;
        if (price != car.price) return false;
        if (!brand.equals(car.brand)) return false;
        if (!model.equals(car.model)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + graduationYear;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "AutoHouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", graduationYear=" + graduationYear +
                ", price=" + price +
                '}';
    }
}
