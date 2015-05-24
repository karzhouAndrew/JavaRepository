package extraLab10;


public class Car {
    private int id;
    private int year;
    private int price;
    private String brandName;
    private String carOptions;

    public Car(int id, int year, int price, String brandName, String carOptions) {
        this.id = id;
        this.year = year;
        this.price = price;
        this.brandName = brandName;
        this.carOptions = carOptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarOptions() {
        return carOptions;
    }

    public void setCarOptions(String carOptions) {
        this.carOptions = carOptions;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Identification number: " + id +
                ", Release year: " + year +
                ", Price,$: " + price +
                ", Brand name: " + brandName +
                ", Additional options: " + carOptions +
                '}';
    }
}
