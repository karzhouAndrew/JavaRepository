package addLab10;


import java.util.*;

public class AutoHouse {
    private Map<Integer, Car> carMap = new HashMap<Integer, Car>();
    private int carID;

    public AutoHouse() {
        carID = 1;
    }

    @AddMenu(paragraphNumber = 1)
    public void addCar() {
        Scanner input = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Добавление автомобиля.");
        System.out.println("Введите марку: ");
        car.setBrand(input.nextLine().toUpperCase());
        System.out.println("Введите модель: ");
        car.setModel(input.nextLine().toUpperCase());
        System.out.println("Введите год выпуска: ");
        car.setProductionYear(input.nextInt());
        System.out.println("Введите цену: ");
        car.setPrice(input.nextInt());
        carMap.put(carID++, car);
        System.out.println("Автомобиль добавлен.");
    }

    @AddMenu(paragraphNumber = 2)
    public void removeCar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите иднтификатор машины.");
        int carID = input.nextInt();
        if (carMap.containsKey(carID)) {
            carMap.remove(carID);
            System.out.println("Автомобиль удалён.");
        } else {
            System.out.println("Автомобиль с таким ID не найден.");
        }
    }

    @AddMenu(paragraphNumber = 3)
    public void brandSearch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите марку автомобиля: ");
        String brand = input.nextLine().toUpperCase();
        Iterator<Integer> keySetIterator = carMap.keySet().iterator();
        boolean find = false;
        while (keySetIterator.hasNext()) {
            int key = keySetIterator.next();
            if (carMap.get(key).getBrand().compareTo(brand) == 0) {
                System.out.println("carID = " + key);
                System.out.println(carMap.get(key));
                find = true;
            }
        }
        if (!find) {
            System.out.println("Нет автомобилей такой марки.");
        }
    }

    @AddMenu(paragraphNumber = 4)
    public void productionYearSearch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год выпуска автомобиля: ");
        int year = input.nextInt();
        Iterator<Integer> keySetIterator = carMap.keySet().iterator();
        boolean find = false;
        while (keySetIterator.hasNext()) {
            int key = keySetIterator.next();
            if (carMap.get(key).getProductionYear() == year) {
                System.out.println("carID = " + key);
                System.out.println(carMap.get(key));
                find = true;
            }
        }
        if (!find) {
            System.out.println("Нет автомобилей такого года выпуска.");
        }
    }

    @AddMenu(paragraphNumber = 5)
    public void productionYearSort() {
        YearComparator yearComparator = new YearComparator(carMap);
        Map<Integer, Car> sortedCarMap = new TreeMap<Integer, Car>(yearComparator);
        sortedCarMap.putAll(carMap);
        printSortedCarMap(sortedCarMap);
    }

    @AddMenu(paragraphNumber = 6)
    public void priceSort() {
        PriceComparator priceComparator = new PriceComparator(carMap);
        Map<Integer, Car> sortedCarMap = new TreeMap<Integer, Car>(priceComparator);
        sortedCarMap.putAll(carMap);
        printSortedCarMap(sortedCarMap);
    }

    @AddMenu(paragraphNumber = 7)
    public void printAutoHouse() {
        Iterator<Integer> keySetIterator = carMap.keySet().iterator();
        while (keySetIterator.hasNext()) {
            int key = keySetIterator.next();
            System.out.println("carID = " + key);
            System.out.println(carMap.get(key));
        }
    }

    public void defaultCarMap() {
        carMap.put(carID++, new Car("audi", "a4", 2005, 7000));
        carMap.put(carID++, new Car("audi", "a4", 2005, 7000));
        carMap.put(carID++, new Car("bmw", "x5", 2007, 6000));
        carMap.put(carID++, new Car("opel", "astra", 1998, 8000));
    }

    public void printSortedCarMap(Map<Integer, Car> carMap) {
        Iterator<Integer> keySetIterator = carMap.keySet().iterator();
        while (keySetIterator.hasNext()) {
            int key = keySetIterator.next();
            System.out.println("carID = " + key);
            System.out.println(carMap.get(key));
        }
    }
}
