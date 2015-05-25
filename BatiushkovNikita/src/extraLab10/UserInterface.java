package extraLab10;


import java.awt.*;
import java.util.Scanner;


public class UserInterface {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please make a selection: ");

        switch (scanner.nextInt()) {
            case MainMenu.ADD_CAR.getValue():
                System.out.println("1.  Add new car in AutoHouse.");
                break;
            case REMOVE_CAR:
                System.out.println("2.  Remove car from the AutoHouse by ID.");
                break;
        }


        /*System.out.println("1.  Add new car in AutoHouse.");
        System.out.println("2.  Remove car from the AutoHouse by ID.");
        System.out.println("3.  Search cars by brand.");
        System.out.println("4.  Search cars by year.");
        System.out.println("5.  Sort cars by year.");
        System.out.println("6.  Sort cars by price.");
        System.out.println("7.  View all cars.");
        System.out.println();*/
    }


}
