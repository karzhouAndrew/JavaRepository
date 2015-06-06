package autoHouse;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car {
    private final String vin;
    private Calendar releaseDate;
    private String brand;
    private String color;
    private int price;

    public Car(String vin, Calendar releaseDate, String brand, String color, int price) {
        this.vin = vin;
        this.releaseDate = releaseDate;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(GregorianCalendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                "vin='" + vin + '\'' +
                ", releaseDate=" + releaseDate.get(1) + " " + releaseDate.get(2) + " " + releaseDate.get(5) +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        if (releaseDate != null ? !releaseDate.equals(car.releaseDate) : car.releaseDate != null) return false;
        if (vin != null ? !vin.equals(car.vin) : car.vin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vin != null ? vin.hashCode() : 0;
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}