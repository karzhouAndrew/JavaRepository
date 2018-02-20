package add10;

import java.util.*;

public class ProcessingAuto {
    private Map<Integer, Car> autoMap = new HashMap<Integer, Car>();
    private int vehicleNumber = 1000;

    public void startAutoHouse() {
        autoMap.put(vehicleNumber++, new Car("SsangYong", "Korando", 2005, 9000));
        autoMap.put(vehicleNumber++, new Car("SsangYong", "Rexston", 2009, 15000));
        autoMap.put(vehicleNumber++, new Car("BMW", "X5", 2007, 14000));
        autoMap.put(vehicleNumber++, new Car("BMW", "740", 2001, 8000));
        autoMap.put(vehicleNumber++, new Car("BMW", "535", 2015, 17000));
    }

    public void additionVehicle() {
        Car autoHouse = new Car();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку автомобиля: ");
        autoHouse.setBrand(scanner.nextLine().toUpperCase());
        System.out.println("Введите модель автомобиля: ");
        autoHouse.setModel(scanner.nextLine().toUpperCase());
        System.out.println("Введите год выпуска автомобиля: ");
        autoHouse.setGraduationYear(scanner.nextInt());
        System.out.println("Введите цену автомобиля: ");
        autoHouse.setPrice(scanner.nextInt());
        autoMap.put(vehicleNumber++, autoHouse);
        System.out.println("Добавление автомобиля окончено. Сделайте выбор пункта меню.");
    }

    public void removeCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите VIN code машины.");
        int identifier = scanner.nextInt();
        if (autoMap.containsKey(identifier)) {
            autoMap.remove(identifier);
            System.out.println("Автомобиль удалён.");
        } else {
            System.out.println("Автомобиль с таким VIN code не найден. Попробуйте еще раз.");
        }
    }

    public void brandFind() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку автомобиля, которую хотите найти: ");
        String brand = scanner.nextLine().toUpperCase();
        Iterator<Integer> iterator = autoMap.keySet().iterator();
        int numberMatches = 0;
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (autoMap.get(temp).getBrand().equalsIgnoreCase(brand)) {
                System.out.println("VIN code = " + temp);
                System.out.println(autoMap.get(temp));
                numberMatches++;
            }
        }
        if (numberMatches == 0) {
            System.out.println("Нет автомобилей такой марки. Попробуйте еще раз.");
        }
    }

    public void graduationYearFind() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год выпуска автомобиля, который хотите найти: ");
        int year = scanner.nextInt();
        Iterator<Integer> iterator = autoMap.keySet().iterator();
        int numberMatches = 0;
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (autoMap.get(temp).getGraduationYear() == year) {
                System.out.println("VIN code = " + temp);
                System.out.println(autoMap.get(temp));
                numberMatches++;
            }
        }
        if (numberMatches == 0) {
            System.out.println("Нет автомобиля с таким годом выпуска. Попробуйте еще раз.");
        }
    }

    public void graduationYearSort() {
        YearComparator yearSorting = new YearComparator(autoMap);
        Map<Integer, Car> yearSortAuto = new TreeMap<Integer, Car>(yearSorting);
        yearSortAuto.putAll(autoMap);
        printAutoHouse(yearSortAuto);
    }


    public void priceSort() {
        PriceComparator priceSorting = new PriceComparator(autoMap);
        Map<Integer, Car> priceSortAuto = new TreeMap<Integer, Car>(priceSorting);
        priceSortAuto.putAll(autoMap);
        printAutoHouse(priceSortAuto);

    }


    public void printAutoHouse() {
        Iterator<Integer> iterator = autoMap.keySet().iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            System.out.println("VIN code = " + temp);
            System.out.println(autoMap.get(temp));
        }
    }

    public void printAutoHouse(Map<Integer, Car> autoMap) {
        Iterator<Integer> iterator = autoMap.keySet().iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            System.out.println("VIN code = " + temp);
            System.out.println(autoMap.get(temp));
        }
    }
}
