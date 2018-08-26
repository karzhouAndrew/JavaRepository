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

import java.util.*;

public class AutoHouse {
    private Map<Integer, Car> cars = new HashMap<>();

    public AutoHouse() {
        addCar(new Car(1976, 17500, "Mazda"));
        addCar(new Car(1999, 12100, "VAZ"));
        addCar(new Car(2003, 52000, "BatMobile"));
        addCar(new Car(2000, 51300, "Volvo"));
        addCar(new Car(2007, 12300, "Mazda"));
    }

    public Set<Map.Entry<Integer, Car>> getSortedCarsByPrice() {
        Set<Map.Entry<Integer, Car>> sortedCars = new TreeSet<Map.Entry<Integer, Car>>(
                new Comparator<Map.Entry<Integer, Car>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Car> compareCar1, Map.Entry<Integer, Car> compareCar2) {
                        return Integer.compare(compareCar1.getValue().getPrice(), compareCar2.getValue().getPrice());
                    }
                }
        );
        sortedCars.addAll(cars.entrySet());
        return sortedCars;
    }

    public Set<Map.Entry<Integer, Car>> getSortedCarsByYear() {
        Set<Map.Entry<Integer, Car>> sortedCars = new TreeSet<Map.Entry<Integer, Car>>(
                new Comparator<Map.Entry<Integer, Car>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Car> compareCar1, Map.Entry<Integer, Car> compareCar2) {
                        return Integer.compare(compareCar1.getValue().getYear(), compareCar2.getValue().getYear());
                    }
                }
        );
        sortedCars.addAll(cars.entrySet());
        return sortedCars;
    }

    public Map<Integer, Car> getCarsByYear(int year) {
        Map<Integer, Car> carsByYear = new TreeMap<Integer, Car>();
        for (Map.Entry<Integer, Car> car : cars.entrySet()) {
            if (car.getValue().getYear() == year) {
                carsByYear.put(car.getKey(), car.getValue());
            }
        }
        return carsByYear;
    }

    public Map<Integer, Car> getCarsByBrand(String brand) {
        Map<Integer, Car> carsByBrand = new TreeMap<Integer, Car>();
        for (Map.Entry<Integer, Car> car : cars.entrySet()) {
            if (car.getValue().getBrandName().equalsIgnoreCase(brand)) {
                carsByBrand.put(car.getKey(), car.getValue());
            }
        }
        return carsByBrand;
    }

    public void addCar(Car car) {
        cars.put(car.getId(), car);
    }

    public void removeCar(int id) {
        cars.remove(id);
    }

    public Map<Integer, Car> getCars() {
        return cars;
    }
}
