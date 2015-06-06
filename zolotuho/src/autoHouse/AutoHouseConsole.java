package autoHouse;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class AutoHouseConsole {
    private static boolean correctEnter = true;

    public static int consoleEnterInt() {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            return input.nextInt();
        } else {
            System.out.println(correctEnter);
            return 0;
        }
    }

    public static String consoleEnterString() {
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            return input.nextLine();
        } else {
            correctEnter = false;
            return null;
        }
    }

    public static void addCar(AutoHouse autoHouse) {
        correctEnter = true;
        System.out.println("Enter data car:");
        System.out.println("VIN - ");
        String vin = consoleEnterString();
        System.out.println("Brand name - ");
        String brand = consoleEnterString();
        System.out.println("Color - ");
        String color = consoleEnterString();
        System.out.println("Release date");
        System.out.println("Year - ");
        int year = consoleEnterInt();
        System.out.println("Month(number) - ");
        int month = consoleEnterInt();
        System.out.println("Month day - ");
        int day = consoleEnterInt();
        System.out.println("Price - ");
        int price = consoleEnterInt();
        System.out.println("key - ");
        int key = consoleEnterInt();
        System.out.println(correctEnter);
        if (correctEnter == true) {
            boolean successCreation =
                    autoHouse.addCar(new Car(vin, new GregorianCalendar(year, month, day), brand, color, price), key);
            if (successCreation == true) {
                System.out.println("created");
            } else {
                System.out.println("unsuccessful attempt!! try else ");
            }
        } else {
            System.out.println("unsuccessful attempt!! incorrect enter ");
        }
    }

    public static void deleteCar(AutoHouse autoHouse) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter key");
        if (input.hasNextInt()) {
            boolean successDeletion = autoHouse.deleteCarByKey(input.nextInt());
            if (successDeletion == true) {
                System.out.println("deleted");
            } else {
                System.out.println("unsuccessful attempt!! try else");
            }
        } else {
            System.out.println("unsuccessful attempt!! incorrect enter");
        }
    }

    public static void searchCarByBrand(AutoHouse autoHouse) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter brand - ");
        if (input.hasNextLine()) {
            List<Integer> searchedCars = autoHouse.searchCarByBrand(input.nextLine());
            if (searchedCars.isEmpty() == false) {
                for (int i = 0; i < searchedCars.size(); i++) {
                    autoHouse.showCarByKey(searchedCars.get(i));
                }
            } else {
                System.out.println("nothing found");
            }
        }
    }

    public static void searchCarByYear(AutoHouse autoHouse) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter year - ");
        if (input.hasNextInt()) {
            List<Integer> searchedCars = autoHouse.searchCarByReleaseYear(input.nextInt());
            if (searchedCars.isEmpty() == false) {
                for (int i = 0; i < searchedCars.size(); i++) {
                    autoHouse.showCarByKey(searchedCars.get(i));
                }
            } else {
                System.out.println("nothing found");
            }
        }
    }

    public static void sortByYear(AutoHouse autoHouse) {
        System.out.println("Sorted by Year");
        List<Integer> sortedCars = autoHouse.sortByYear();
        for (int i = 0; i < sortedCars.size(); i++) {
            autoHouse.showCarByKey(sortedCars.get(i));
        }
    }

    public static void sortByPrice(AutoHouse autoHouse) {
        System.out.println("Sorted by price");
        List<Integer> sortedCars = autoHouse.sortByPrice();
        for (int i = 0; i < sortedCars.size(); i++) {
            autoHouse.showCarByKey(sortedCars.get(i));
        }
    }

    public static void showCars(AutoHouse autoHouse) {
        System.out.println(autoHouse.getCarsSet());
    }
}