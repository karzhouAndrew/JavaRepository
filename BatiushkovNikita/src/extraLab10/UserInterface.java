package extraLab10;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    public static final AutoHouse AUTO_HOUSE = new AutoHouse();

    public static void main(String[] args) {
        System.out.println("Welcome to the AutoHouse!");
        System.out.println();
        mainMenu();
        //carViewer(AUTO_HOUSE.getCarsByBrand("Mazda"));
    }

    public static void mainMenu() {
        System.out.println();
        System.out.println("1.  Add new car in AutoHouse.");
        System.out.println("2.  Remove car from the AutoHouse by ID.");
        System.out.println("3.  Search cars by brand.");
        System.out.println("4.  Search cars by year.");
        System.out.println("5.  Sort cars by year.");
        System.out.println("6.  Sort cars by price.");
        System.out.println("7.  View all cars.");
        System.out.println("8.  Exit.");
        System.out.printf("Make your choice: ");

        int choice;
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1) {
                    menuAddCar();
                    mainMenu();
                } else if (choice == 2) {
                    menuRemoveCar();
                    mainMenu();
                } else if (choice == 3) {
                    menuSearchByBrand();
                    mainMenu();
                } else if (choice == 4) {
                    menuSearchByYear();
                    mainMenu();
                } else if (choice == 5) {
                    menuSortByYear();
                    mainMenu();
                } else if (choice == 6) {
                    menuSortByPrice();
                    mainMenu();
                } else if (choice == 7) {
                    menuViewAll();
                    mainMenu();
                } else if (choice == 8) {
                    return;
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong input. Try again.");
                System.out.printf("Make your choice: ");
            }
        }
    }

    public static void menuAddCar() {
        String carBrand = enterBrandName();
        int carYear = enterCarYear();
        int carPrice = enterCarPrice();
        Car car = new Car(carYear, carPrice, carBrand);
        AUTO_HOUSE.addCar(car);
        System.out.println("Car was added.");
    }

    public static void menuRemoveCar() {
        int id = enterCarId();
        if (AUTO_HOUSE.getCars().containsKey(id)) {
            AUTO_HOUSE.removeCar(id);
            System.out.println("Car was removed.");
        } else {
            System.out.println("Id " + id + " not found. Try again.");
        }

    }

    public static void menuSearchByBrand() {
        String carBrand = enterBrandName();
        Map<Integer, Car> cars = AUTO_HOUSE.getCarsByBrand(carBrand);
        if (cars.isEmpty()) {
            System.out.println("Car brand " + "\"" + carBrand + "\"" + " not found. Try again.");
        } else {
            carViewer(cars);
        }
    }

    public static void menuSearchByYear() {
        int year = enterCarYear();
        Map<Integer, Car> cars = AUTO_HOUSE.getCarsByYear(year);
        if (cars.isEmpty()) {
            System.out.println("Year " + "\"" + year + "\"" + " not found. Try again.");
        } else {
            carViewer(cars);
        }
    }

    public static void menuSortByYear() {
        carViewer(AUTO_HOUSE.getSortedCarsByYear());
    }

    public static void menuSortByPrice() {
        carViewer(AUTO_HOUSE.getSortedCarsByPrice());
    }

    public static void menuViewAll() {
        carViewer(AUTO_HOUSE.getCars());
    }

    public static int enterCarId() {
        int carId;
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("(Integer) Enter car id: ");
            if (scanner.hasNextInt()) {
                carId = scanner.nextInt();
                if (carId >= 0) {
                    break;
                }
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        return carId;
    }

    public static String enterBrandName() {
        String carBrand = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("(String) Enter car brand name: ");
        if (scanner.hasNext()) {
            carBrand = scanner.next();
        }
        return carBrand;
    }

    public static int enterCarPrice() {
        int carPrice;
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("(Integer) Enter car price: ");
            if (scanner.hasNextInt()) {
                carPrice = scanner.nextInt();
                if (carPrice >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }
        }
        return carPrice;
    }

    public static int enterCarYear() {
        int carYear;
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("(Integer) Enter car year: ");
            if (scanner.hasNextInt()) {
                carYear = scanner.nextInt();
                if (carYear < 2015 && carYear > 1800) {
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        return carYear;
    }

    public static void carViewer(Map<Integer, Car> cars) {
        System.out.println("Id" + "\t" + "Brand" + "\t" + "Year" + "\t" + "Price");
        for (Map.Entry<Integer, Car> car : cars.entrySet()) {
            System.out.printf(car.getValue().getId() + "\t");
            System.out.printf(car.getValue().getBrandName() + "\t");
            System.out.printf(car.getValue().getYear() + "\t");
            System.out.printf(car.getValue().getPrice() + "\t");
            System.out.println();
        }
    }

    public static void carViewer(Set<Map.Entry<Integer, Car>> cars) {
        System.out.println("Id" + "\t" + "Brand" + "\t" + "Year" + "\t" + "Price");
        for (Map.Entry<Integer, Car> car : cars) {
            System.out.printf(car.getValue().getId() + "\t");
            System.out.printf(car.getValue().getBrandName() + "\t");
            System.out.printf(car.getValue().getYear() + "\t");
            System.out.printf(car.getValue().getPrice() + "\t");
            System.out.println();
        }
    }

}






