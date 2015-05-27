package extraLab10;


public class Car {
    private int id;
    private int year;
    private int price;
    private String brandName;

    public Car(int year, int price, String brandName) {
        this.id = (int) (Math.random() * 1e4);
        this.year = year;
        this.price = price;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getBrandName() {
        return brandName;
    }
}
