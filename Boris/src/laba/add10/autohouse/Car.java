package laba.add10.autohouse;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car {
    private String company;
    private String color;
    private GregorianCalendar yearOfIssue = new GregorianCalendar();
    private int price;

    protected Car(String company, String color, int yearOfIssue, int price) {
        this.company = company;
        this.color = color;
        this.yearOfIssue.set(Calendar.YEAR, yearOfIssue);
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        if (company != null ? !company.equals(car.company) : car.company != null) return false;
        if (yearOfIssue != null ? !yearOfIssue.equals(car.yearOfIssue) : car.yearOfIssue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (yearOfIssue != null ? yearOfIssue.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "\n" + "Car{" +
                "company='" + company + '\'' +
                ", color='" + color + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", price=" + price +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public String getColor() {
        return color;
    }

    public GregorianCalendar getYearOfIssue() {
        return yearOfIssue;
    }

    public int getPrice() {
        return price;
    }
}
