package extraLab10;


import java.awt.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class UserInterface {
    public static final AutoHouse AUTO_HOUSE = new AutoHouse();

    public static void main(String[] args) {
        System.out.println("Welcome to the AutoHouse!");
        //carViewer(AUTO_HOUSE.getCarsByBrand("Mazda"));
        //carViewer(AUTO_HOUSE.getSortedCarsByPrice());
        //carViewer(AUTO_HOUSE.getCars());
        mainMenu();
        //menuAddCar();
    }

    public static void mainMenu() {
/*
        System.out.println("1.  Add new car in AutoHouse.");
        System.out.println("2.  Remove car from the AutoHouse by ID.");
        System.out.println("3.  Search cars by brand.");
        System.out.println("4.  Search cars by year.");
        System.out.println("5.  Sort cars by year.");
        System.out.println("6.  Sort cars by price.");
        System.out.println("7.  View all cars.");
        System.out.println("8.  Exit.");
*/

        int choice;
        Scanner scanner;
        System.out.println("Enter Integer: ");
        while (true) {
            scanner  = new Scanner(System.in);
            if (scanner.hasNextInt() == true) {
                choice = scanner.nextInt();
                if (choice == 1) {
                    testCase1();
                    mainMenu();
                    break;
                } else if (choice == 2) {
                    testCase2();
                    mainMenu();
                    break;
                } else if (choice == 3) {
                    testCase3();
                    mainMenu();
                    break;
                } else {
                    break;
                }
                //break;
            } else {
                System.out.println("Wrong input. Try again.");
            }
        }


    }

    public static void testCase1() {
        System.out.println("testCase1 worked");
    }

    public static void testCase2() {
        System.out.println("testCase2 worked");
    }

    public static void testCase3() {
        System.out.println("testCase3 worked");
    }

    public static void menuRemoveCar() {

    }

    public static void menuAddCar() {
        Scanner scanner;

        int carYear;
        int carPrice;
        String carBrand = null;

        scanner = new Scanner(System.in);
        System.out.print("(String) Enter car brand name: ");
        if (scanner.hasNext()) {
            carBrand = scanner.next();
        }

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

        Car car = new Car((int) (Math.random() * 1e4), carYear, carPrice, carBrand);
        AUTO_HOUSE.addCar(car);
        System.out.println("\n" + "Car was added." + "\n");
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






