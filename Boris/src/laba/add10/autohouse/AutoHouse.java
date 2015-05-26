package laba.add10.autohouse;

//Описываем систему AutoHouse. В автохаусе на данный момент есть несколько различных машин. У каждой машины свой уникальный идентификатор.
//
//Реализовать следующие функции.
//        1) Добавление и удаление новых машин в/из автохаус(а).
//        2) Поиск машин по марке.
//        3) Поиск машин по году выпуска.
//        4) Сортировка по году.
//        5) Сортировка по цене.
//
//        Реализовать консольное меню.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AutoHouse {
    private Map<Integer, Car> listingExistedCar;

    public AutoHouse() {
        listingExistedCar = new HashMap<Integer, Car>();
    }

    public void addCarInAutoHouse(String company, String color, int yearOfIssue, int price) {
        listingExistedCar.put(generateID(), new Car(company, color, yearOfIssue, price));
    }

    private int generateID() {
        int ID = new Random().nextInt(1000);
        while (listingExistedCar.containsKey(ID)) {
            ID = new Random().nextInt(1000);
        }
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoHouse autoHouse = (AutoHouse) o;

        if (listingExistedCar != null ? !listingExistedCar.equals(autoHouse.listingExistedCar) : autoHouse.listingExistedCar != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return listingExistedCar != null ? listingExistedCar.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AutoHouse{" +
                "listingExistedCar=" + listingExistedCar +
                '}';
    }


}
