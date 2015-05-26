package extraLab10;


import java.awt.*;
import java.util.Scanner;


public class UserInterface {
    public final static AutoHouse AUTO_HOUSE = new AutoHouse();

    public static void main(String[] args) {
        menuAddCar();
        //mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Welcome to the AutoHouse!");
        System.out.println("1.  Add new car in AutoHouse.");
        System.out.println("2.  Remove car from the AutoHouse by ID.");
        System.out.println("3.  Search cars by brand.");
        System.out.println("4.  Search cars by year.");
        System.out.println("5.  Sort cars by year.");
        System.out.println("6.  Sort cars by price.");
        System.out.println("7.  View all cars.");
        System.out.println("8.  Exit.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("(Integer) Please make a selection: ");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            scanner.close();
            switch (i) {
                case 1:
                    menuAddCar();
                    break;
                case 2:
                    System.out.println("zzzzzzzzz");
                    break;
            }
        } else {
            System.out.println();
            System.out.println("Wrong input. Try again." + "\n");
            mainMenu();
        }
    }

    public static void menuAddCar() {
        Scanner scanner;

        int carId;
        int carYear;
        int carPrice;
        String carBrand;


        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("(Integer) Enter car id: ");
            if (scanner.hasNextInt()) {
                carId = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
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
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        //scanner.remove(); http://www.cs.utexas.edu/users/ndale/Scanner.html

        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("(Integer) Enter car price: ");
            if (scanner.hasNext()) {
                carBrand = scanner.next();
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
    }
}





