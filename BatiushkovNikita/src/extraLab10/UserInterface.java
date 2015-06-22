package extraLab10;


import java.util.*;

public class UserInterface {
    public static final AutoHouse AUTO_HOUSE = new AutoHouse();

    public static void main(String[] args) {
        System.out.println("Welcome to the AutoHouse!");
        System.out.println();
        mainMenu();
    }

    public static void mainMenu() {
        showMenuOptions();
        int userInput = 0;
        Scanner scanner;
        boolean exit = true;
        while (exit) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                switch (Menu.getIndex(userInput)) {
                    case ADD_NEW_CAR:
                        menuAddCar();
                        break;
                    case REMOVE_CAR:
                        menuRemoveCar();
                        break;
                    case SEARCH_CARS_BY_BRAND:
                        menuSearchByBrand();
                        break;
                    case SEARCH_CARS_BY_YEAR:
                        menuSearchByYear();
                        break;
                    case SORT_CARS_BY_YEAR:
                        menuSortByYear();
                        break;
                    case SORT_CARS_BY_PRICE:
                        menuSortByPrice();
                        break;
                    case VIEW_ALL_CARS:
                        menuViewAll();
                        break;
                    case EXIT:
                        exit = false;
                        break;
                    default:
                        System.out.println("Wrong input. Try again.");
                        System.out.printf("Make your choice: ");
                        break;
                }
                if (exit) {
                    mainMenu();
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong input. Try again.");
                System.out.printf("Make your choice: ");
            }
            scanner.close();
            break;
        }
    }

    public static void showMenuOptions() {
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
            viewCars(cars.entrySet());
        }
    }

    public static void menuSearchByYear() {
        int year = enterCarYear();
        Map<Integer, Car> cars = AUTO_HOUSE.getCarsByYear(year);
        if (cars.isEmpty()) {
            System.out.println("Year " + "\"" + year + "\"" + " not found. Try again.");
        } else {
            viewCars(cars.entrySet());
        }
    }

    public static void menuSortByYear() {
        viewCars(AUTO_HOUSE.getSortedCarsByYear());
    }

    public static void menuSortByPrice() {
        viewCars(AUTO_HOUSE.getSortedCarsByPrice());
    }

    public static void menuViewAll() {
        viewCars(AUTO_HOUSE.getCars().entrySet());
    }

    public static int enterCarId() {
        int carId = 0;
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
                System.out.println("Wrong input. Try again.");
            }
            scanner.close();
        }
        return carId;
    }

    public static String enterBrandName() {
        String carBrand = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("(String) Enter car brand name: ");
        if (scanner.hasNext()) {
            carBrand = scanner.next();
            scanner.close();
        }
        scanner.close();
        return carBrand;
    }

    public static int enterCarPrice() {
        int carPrice = 0;
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("(Integer) Enter car price: ");
            if (scanner.hasNextInt()) {
                carPrice = scanner.nextInt();
                if (carPrice >= 0 && carPrice < Integer.MAX_VALUE) {
                    break;
                } else {
                    System.out.println("Wrong input. Try again.");
                }
            } else {
                System.out.println("Wrong input. Try again.");
            }
            scanner.close();
        }
        return carPrice;
    }

    public static int enterCarYear() {
        GregorianCalendar calendar = new GregorianCalendar();
        int carYear;
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("(Integer) Enter car year: ");
            if (scanner.hasNextInt()) {
                carYear = scanner.nextInt();
                if (carYear <= calendar.get(Calendar.YEAR) && carYear > 1800) {
                    break;
                } else {
                    System.out.println("Wrong input. Try again.");
                }
            } else {
                System.out.println("Wrong input. Try again.");
            }
            scanner.close();
        }
        return carYear;
    }

    public static void viewCars(Set<Map.Entry<Integer, Car>> cars) {
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






