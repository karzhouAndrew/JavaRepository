package laba.add10.autohouse;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car {
    private CompanyEnum company;
    private GregorianCalendar constructYear;
    private int price;

    protected Car(CompanyEnum company, int constructYear, int price) {
        this.company = company;
        this.constructYear = new GregorianCalendar(constructYear, 0, 1);
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (company != car.company) return false;
        if (constructYear != null ? !constructYear.equals(car.constructYear) : car.constructYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (constructYear != null ? constructYear.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company=" + company +
                ", constructYear=" + constructYear.get(Calendar.YEAR) +
                ", price=" + price +
                '}' + "\n";
    }

    public CompanyEnum getCompany() {
        return company;
    }

    public GregorianCalendar getConstructYear() {
        return constructYear;
    }

    public int getPrice() {
        return price;
    }
}
