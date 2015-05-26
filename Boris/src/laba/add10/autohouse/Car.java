package laba.add10.autohouse;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car {
    private CompanyEnum company;
    private ColorEnum color;
    private GregorianCalendar yearOfIssue;
    private int price;

    protected Car(CompanyEnum company, ColorEnum color, int yearOfIssue, int price) {
        this.company = company;
        this.color = color;
        this.yearOfIssue = new GregorianCalendar(yearOfIssue, 0, 1);
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (color != car.color) return false;
        if (company != car.company) return false;
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
        return "Car{" +
                "company=" + company +
                ", color=" + color +
                ", yearOfIssue=" + yearOfIssue.get(Calendar.YEAR) +
                ", price=" + price +
                '}' + "\n";
    }

    public CompanyEnum getCompany() {
        return company;
    }

    public ColorEnum getColor() {
        return color;
    }

    public GregorianCalendar getYearOfIssue() {
        return yearOfIssue;
    }

    public int getPrice() {
        return price;
    }
}
