package autoHouse;

import java.util.*;

//10.  Описываем систему AutoHouse.
// В автохаусе на данный момент есть несколько различных машин.
// У каждой машины свой уникальный идентификатор. Реализовать следующие функции.
// 1) Добавление и удаление новых машин в/из автохаус(а).
// 2) Поиск машин по марке.
// 3) Поиск машин по году выпуска.
// 4) Сортировка по году.
// 5) Сортировка по цене. Реализовать консольное меню.
public class AutoHouse {
    private HashMap<Integer, Car> cars;

    public HashMap<Integer, Car> getCars() {
        return this.cars;
    }

    public Collection<Car> getCarsCollection() {
        return this.cars.values();
    }

    public Set<Integer> getNumbers() {
        return this.cars.keySet();
    }

    public void setCars(HashMap<Integer, Car> cars) {
        this.cars = cars;
    }

    public Set<Map.Entry<Integer, Car>> getCarsSet() {
        return cars.entrySet();
    }

    public AutoHouse(HashMap<Integer, Car> cars) {
        this.cars = cars;
    }

    public boolean addCar(Car car, int number) {

        if (cars.containsKey(number)) {
            return false;
        } else {
            cars.put(number, car);
            return true;
        }
    }

    public boolean deleteCarByValue(Car car) {
        boolean presenceValue = false;
        Set<Map.Entry<Integer, Car>> couple = cars.entrySet();
        Iterator<Map.Entry<Integer, Car>> iterator = couple.iterator();
        while (iterator.hasNext()) {
            Car currentCar = iterator.next().getValue();
            if (currentCar.equals(car)) {
                iterator.remove();
                presenceValue = true;
                break;
            }
        }
        return presenceValue;
    }

    public boolean deleteCarByKey(int key) {

        if (cars.containsKey(key)) {
            cars.remove(key);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> searchCarByBrand(String brand) {
        Set<Map.Entry<Integer, Car>> couple = cars.entrySet();
        ArrayList<Integer> searchedKeysOutput = new ArrayList<Integer>();
        for (Map.Entry<Integer, Car> integerCarEntry : couple) {
            if (brand.equals(integerCarEntry.getValue().getBrand())) {
                searchedKeysOutput.add(integerCarEntry.getKey());
            }
        }
        return searchedKeysOutput;
    }

    public ArrayList<Integer> searchCarByReleaseYear(int year) {
        Set<Map.Entry<Integer, Car>> couples = cars.entrySet();
        ArrayList<Integer> searchedKeysOutput = new ArrayList<Integer>();
        for (Map.Entry<Integer, Car> integerCarEntry : couples) {
            if (year == (integerCarEntry.getValue().getReleaseDate().get(1))) {
                searchedKeysOutput.add(integerCarEntry.getKey());
            }
        }
        return searchedKeysOutput;
    }

    public ArrayList<Integer> sortByYear() {
        Set<Map.Entry<Integer, Car>> couples = cars.entrySet();
        Iterator<Map.Entry<Integer, Car>> iterator = couples.iterator();
        Set<Car> sortedCars = new TreeSet<Car>(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getReleaseDate().get(1) > car2.getReleaseDate().get(1) ? 1 : -1;
            }
        });

        while (iterator.hasNext()) {
            sortedCars.add(iterator.next().getValue());
        }

        ArrayList<Integer> sortedCarsOutput = new ArrayList<Integer>();
        Iterator<Car> carIterator = sortedCars.iterator();
        couples.iterator();
        while (carIterator.hasNext()) {
            Car currentCar = carIterator.next();
            for (Map.Entry<Integer, Car> couple : couples) {
                if (currentCar.equals(couple.getValue())) {
                    sortedCarsOutput.add(couple.getKey());
                }
            }
        }
        return sortedCarsOutput;
    }

    public ArrayList<Integer> sortByPrice() {
        Set<Map.Entry<Integer, Car>> couples = cars.entrySet();
        Iterator<Map.Entry<Integer, Car>> iterator = couples.iterator();
        Set<Car> sortedCars = new TreeSet<Car>(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getReleaseDate().get(1) > car2.getReleaseDate().get(1) ? 1 : -1;
            }
        });

        while (iterator.hasNext()) {
            sortedCars.add(iterator.next().getValue());
        }
        ArrayList<Integer> sortedCarsOutput = new ArrayList<Integer>();
        Iterator<Car> carIterator = sortedCars.iterator();
        couples.iterator();
        while (carIterator.hasNext()) {
            Car currentCar = carIterator.next();
            for (Map.Entry<Integer, Car> couple : couples) {
                if (currentCar.equals(couple.getValue())) {
                    sortedCarsOutput.add(couple.getKey());
                }
            }
        }
        return sortedCarsOutput;
    }

    public void showCarByKey(int key) {
        System.out.println(key + " " + cars.get(key));
    }
}