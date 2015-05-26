package extraLab10;


import java.awt.*;
import java.util.Scanner;


public class UserInterface {
    public static void main(String[] args) {
        //AutoHouse autoHouse = new AutoHouse();
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("(Integer) Enter car Id: ");
        int carId;
        while (scanner.hasNext() == true) {
            if (scanner.hasNextInt()) {
                carId = scanner.nextInt();
                break;
            } else {
                System.out.println("wrong");
                //return;
            }
        }
    }
}





