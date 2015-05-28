package add10;
import java.util.*;

public class ProcessingAuto {
    private Map<Integer, AutoHouse> autoMap = new HashMap<Integer, AutoHouse>();
    private int vehicleNumber = 1000;

    public void startAutoHouse() {
        autoMap.put(vehicleNumber++, new AutoHouse("SsangYong", "Korando", 2005, 9000));
        autoMap.put(vehicleNumber++, new AutoHouse("SsangYong", "Rexston", 2009, 15000));
        autoMap.put(vehicleNumber++, new AutoHouse("BMW", "X5", 2007, 14000));
        autoMap.put(vehicleNumber++, new AutoHouse("BMW", "740", 2001, 8000));
        autoMap.put(vehicleNumber++, new AutoHouse("BMW", "535", 2015, 17000));
    }

    public void additionVehicle() {
        AutoHouse autoHouse = new AutoHouse();
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
            if (autoMap.get(temp).getBrand().compareTo(brand) == 0) {
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
        YearSorting yearSorting = new YearSorting(autoMap);
        Map<Integer, AutoHouse> yearSortAuto = new TreeMap<Integer, AutoHouse>(yearSorting);
        yearSortAuto.putAll(autoMap);
        printAutoHouse(yearSortAuto);
    }


    public void priceSort() {
        PriceSorting priceSorting = new PriceSorting(autoMap);
        Map<Integer, AutoHouse> priceSortAuto = new TreeMap<Integer, AutoHouse>(priceSorting);
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

    public void printAutoHouse(Map<Integer, AutoHouse> autoMap) {
        Iterator<Integer> iterator = autoMap.keySet().iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            System.out.println("VIN code = " + temp);
            System.out.println(autoMap.get(temp));
        }
    }
}