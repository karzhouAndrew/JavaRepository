package autohouse;

/**
 * Created by Master on 27.05.2015.
 */
public class Auto {
    private int id;
    private int year;
    private double price;
    private String carModel;

    public Auto(  String carModel, int year, double price) {
        this.id = (int)(Math.random()*1000);
        this.year = year;
        this.price = price;
        this.carModel = carModel;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", year=" + year +
                ", price=" + price +
               '}';
    }


}
