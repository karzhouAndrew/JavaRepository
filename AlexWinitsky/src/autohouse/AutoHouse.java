package autohouse;

import java.util.*;

/**
 * Created by Master on 28.05.2015.
 */
public class AutoHouse {


    public void removeAuto(Map<Integer, Auto> autoHouse, int number) {
        boolean id = false;
        for (Map.Entry<Integer, Auto> set : autoHouse.entrySet()) {
            if (set.getKey() == number) {
                id = true;
                autoHouse.remove(number);
                System.out.println("Автомобиль с ID " + number + " удален из коллекции");
                break;
            }
        }
        if (!id) {
            System.out.println("Неверный ID автомобиля ");
        }
    }


    public List<Auto> searchCarByYear(Map<Integer, Auto> autoHouse, int number) {
        List<Auto> serachCar = new ArrayList<Auto>();
        boolean search = false;
        for (Map.Entry<Integer, Auto> set : autoHouse.entrySet()) {
            if (set.getValue().getYear() == number) {
                serachCar.add(set.getValue());
                search = true;
            }
        }
        if (!search) {
            System.out.println("В коллекции нет автомобилей с указанной датой");
        }
        return serachCar;
    }

    public List<Auto> searchCarByPrice(Map<Integer, Auto> autoHouse, int number) {
        List<Auto> searchCar = new ArrayList<Auto>();
        boolean search = false;
        for (Map.Entry<Integer, Auto> set : autoHouse.entrySet()) {
            if (set.getValue().getPrice() == number) {
                searchCar.add(set.getValue());
                search = true;
            }
        }
        if (!search) {
            System.out.println("В коллекции нет автомобилей по указанной цене");
        }
        return searchCar;
    }

    public void printAutoHouse(Map<Integer, Auto> autoHouse) {
        for (Map.Entry<Integer, Auto> set : autoHouse.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }
    }

    public void sortAutoByYear(Map<Integer, Auto> autoList) {
        List<Auto> autoByYear = new ArrayList<Auto>(autoList.values());
        Collections.sort(autoByYear, new Comparator<Auto>() {
            public int compare(Auto firstAuto, Auto secondAuto) {
                return firstAuto.getYear() - secondAuto.getYear();
            }
        });

        System.out.println("\n" + "Сортировка автомобилей по году выпуска");
        for (Auto sortAuto : autoByYear) {
            System.out.println(sortAuto.getId() + " " + sortAuto.getCarModel() + " " + sortAuto.getYear());
        }
    }

    public void sortAutoByPrice(Map<Integer, Auto> autoList) {
        List<Auto> autoByPrice = new ArrayList<Auto>(autoList.values());
        Collections.sort(autoByPrice, new Comparator<Auto>() {
            public int compare(Auto firstAuto, Auto secondAuto) {
                return firstAuto.getYear() - secondAuto.getYear();
            }
        });

        System.out.println("\n" + "Сортировка автомобилей по цене");
        for (Auto sortAuto : autoByPrice) {
            System.out.println(sortAuto.getId() + " " + sortAuto.getCarModel() + " " + sortAuto.getPrice());
        }
    }


}

