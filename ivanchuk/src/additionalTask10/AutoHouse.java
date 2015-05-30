package additionalTask10;

import java.util.*;

public class AutoHouse {
    private Set<Car> availableCars;
    private final String[] DEFAULT_BRANDS = {"Audi", "BMW", "Mazda", "Mercedes", "Opel", "Renault", "Volkswagen"};

    public AutoHouse(int carsQuantity) {
        availableCars = new HashSet<Car>(carsQuantity);
        while (carsQuantity > 0) {
            availableCars.add(randomCar());
            carsQuantity--;
        }
    }

    public String addCar(String brand, int releaseYear, int price, int additionDate) {
        Car car = new Car(brand, releaseYear, price, additionDate);
        availableCars.add(car);
        return "Авто (" + car.toString() + ") добавлено.";
    }

    public String removeCar(int ID) {
        Iterator<Car> iterator = availableCars.iterator();
        String removeCar = "Авто не найдено!!!";
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getID() == ID) {
                removeCar = "Авто (" + car.toString() + ") удалено.";
                iterator.remove();
            }
        }
        return removeCar;
    }

    public String sortedByYear() {
        Set<Car> sortedCars = new TreeSet<Car>(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                if (car1.getADDITION_DATE() == car2.getADDITION_DATE()) {
                    if (car1.getBrand().equals(car2.getBrand())) {
                        return Integer.compare(car1.getID(), car2.getID());
                    }
                    return car1.getBrand().compareTo(car2.getBrand());
                } else {
                    return Integer.compare(car1.getADDITION_DATE(), car2.getADDITION_DATE());
                }
            }
        });
        sortedCars.addAll(availableCars);
        return toString(sortedCars);
    }

    public String sortedByPrice() {
        Set<Car> sortedCars = new TreeSet<Car>(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                if (car1.getPrice() == car2.getPrice()) {
                    if (car1.getBrand().equals(car2.getBrand())) {
                        return Integer.compare(car1.getID(), car2.getID());
                    }
                    return car1.getBrand().compareTo(car2.getBrand());
                } else {
                    return Integer.compare(car1.getPrice(), car2.getPrice());
                }
            }
        });
        sortedCars.addAll(availableCars);
        return toString(sortedCars);
    }

    public String searchByBrand(String brand) {
        Set<Car> carSet = new HashSet<Car>();
        for (Car car : availableCars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                carSet.add(car);
            }
        }
        if (carSet.size() > 0) {
            return toString(carSet);
        } else {
            return "Авто марки " + brand + " не найдено!!!";
        }
    }

    public String searchByReleaseYear(int year) {
        Set<Car> carSet = new HashSet<Car>();
        for (Car car : availableCars) {
            if (car.getReleaseYear() == year) {
                carSet.add(car);
            }
        }
        if (carSet.size() > 0) {
            return toString(carSet);
        } else {
            return "Авто " + year + " года выпуска не найдено!!!";
        }
    }

    private String toString(Collection<Car> cars) {
        StringBuilder text = new StringBuilder();
        for (Car car : cars) {
            text.append(car).append("\n");
        }
        return new String(text);
    }

    private Car randomCar() {
        String brand = DEFAULT_BRANDS[(int) (Math.random() * DEFAULT_BRANDS.length)];
        int releaseYear = (int) (Math.random() * 3 + 2013);
        int price = (int) (Math.random() * 79 + 20) * 1000;
        int additionalDate = (int) (Math.random() * 2 + 2013);
        return new Car(brand, releaseYear, price, additionalDate);
    }
}
