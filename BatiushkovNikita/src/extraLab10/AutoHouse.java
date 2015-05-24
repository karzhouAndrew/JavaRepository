package extraLab10;

// Описываем систему AutoHouse.
// В автохаусе на данный момент есть несколько различных машин.
// У каждой машины свой уникальный идентификатор.
// Реализовать следующие функции.
//        1) Добавление и удаление новых машин в/из автохаус(а).
//        2) Поиск машин по марке.
//        3) Поиск машин по году выпуска.
//        4) Сортировка по году.
//        5) Сортировка по цене.
// Реализовать консольное меню.


import java.util.HashMap;
import java.util.Map;

public class AutoHouse {
    private Map<Integer, Car> cars = new HashMap<Integer, Car>();

    public AutoHouse() {
        addCar(new Car(7364, 1976, 17500, "Mazda", "Leather upholstery"));
        addCar(new Car(1367, 1999, 12100, "VAZ", null));
        addCar(new Car(8112, 2003, 52000, "BatMobile", "Justice"));
        addCar(new Car(3242, 2000, 51300, "Volvo", null));
        addCar(new Car(3048, 2007, 12300, "Mini", "Freak color"));
    }

    public Map<Integer, Car> getCarsSortedByYear() {
        for (Map.Entry<Integer, Car> car: cars.entrySet()) {
            int year = car.getValue().getYear();
            // http://stackoverflow.com/questions/109383/how-to-sort-a-mapkey-value-on-the-values-in-java
        }
        return cars;
    }


    public Map<Integer, Car> getCarsByYear(int year) {
        Map<Integer, Car> carsByYear = new HashMap<Integer, Car>();
        for (Map.Entry<Integer, Car> car: cars.entrySet()) {
            if (car.getValue().getYear() == year) {
                carsByYear.put(car.getKey(), car.getValue());
            }
        }
        return carsByYear;
    }

    public Map<Integer, Car> getCarsByBrand(String brand) {
        Map<Integer, Car> carsByBrand = new HashMap<Integer, Car>();
        for (Map.Entry<Integer, Car> car: cars.entrySet()) {
            if (car.getValue().getBrandName().equalsIgnoreCase(brand)) {
                carsByBrand.put(car.getKey(), car.getValue());
            }
        }
        return carsByBrand;
    }

    public void addCar(Car car) {
        cars.put(car.getId(), car);
    }

    public void removeCar(Car car) {
        cars.remove(car.getId());
    }

    public Map<Integer, Car> getCarMap() {
        return cars;
    }
}
