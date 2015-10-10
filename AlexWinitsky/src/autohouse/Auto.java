package autohouse;

/**
 * Created by Master on 27.05.2015.
 */
public class Auto {
    private int id;
    private int year;
    private int price;
    private String carModel;

    public Auto(String carModel, int year, int price) {
        this.id = (int) (Math.random() * 1000);
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (id != auto.id) return false;
        if (Double.compare(auto.price, price) != 0) return false;
        if (year != auto.year) return false;
        if (carModel != null ? !carModel.equals(auto.carModel) : auto.carModel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + year;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (carModel != null ? carModel.hashCode() : 0);
        return result;
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
