package auto;

import java.util.Comparator;
import java.util.Date;

/**
 * Created by asus on 25.05.2015.
 */
public class Car {
    public static int idGenerator = 1;
    private int id;
    private String brand;
    private String model;
    private Date age;
    private int price;

    public Car() {
        this.id = idGenerator;
        idGenerator++;
    }

    public Car(String brand, String model, Date age, int price) {
        this.id = idGenerator;
        idGenerator++;
        this.brand = brand;
        this.model = model;
        this.age = age;
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

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public static class Comporators {
        public static Comparator<Car> AGE_UP = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.age.compareTo(car2.age);
            }
        };
        public static Comparator<Car> AGE_DOWN = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return -car1.age.compareTo(car2.age);
            }
        };
        public static Comparator<Car> PRICE_UP = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.price - car2.price;
            }
        };
        public static Comparator<Car> PRICE_DOWN = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car2.price - car1.price;
            }
        };
        public static Comparator<Car> MODEL_UP = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.brand.compareTo(car2.brand);
            }
        };
        public static Comparator<Car> MODEL_DOWN = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return -car1.brand.compareTo(car2.brand);
            }
        };

    }
}
