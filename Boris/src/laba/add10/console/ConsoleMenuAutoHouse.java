package laba.add10.console;


import laba.add10.autohouse.CompanyEnum;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleMenuAutoHouse {
    public static void consoleHello() {
        final int EXIT = 0;
        System.out.println("Hello. You are in AutoHose menu.");
        String message = "Enter a key:\n" +
                "1 - add car in AutoHouse.\n" +
                "2 - remove car in AutoHouse.\n" +
                "3 - find car by company.\n" +
                "4 - find car by year of constructing.\n" +
                "5 - see car list in order to year of constructing.\n" +
                "6 - see car list in order to price.\n" +
                "0 - exit.";
        Integer enteredCommand = -1;
        do {
            System.out.println(message);
            Scanner consoleIn = new Scanner(System.in);

            try {
                enteredCommand = Integer.valueOf(consoleIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter invalid command. Please repeat.");
                continue;
            }
            if (enteredCommand > 0 && enteredCommand < 7) {
                ConsoleMenu.startMethod(enteredCommand);
//                System.out.println("Something else? (Y/N)");
//                if (consoleIn.nextLine().toLowerCase().equals("y")) {
//                    continue;
//                } else {
//                    enteredCommand = EXIT;
//                }
            } else if (enteredCommand == 0) {
                System.out.println("Goodbye.");
                return;
            } else {
                System.out.println("There are not this command. Please repeat.");
            }
        } while (enteredCommand != EXIT);
    }

    public static CompanyEnum enumConsoleCompany() {
        String enteredText;
        String message = "Enter company: (" + Arrays.toString(CompanyEnum.values()) + ").";
        do {
            System.out.println(message);
            Scanner consoleIn = new Scanner(System.in);
            enteredText = consoleIn.nextLine();
            try {
                return CompanyEnum.valueOf(enteredText.toUpperCase());
            } catch (Exception e) {
                System.out.println("There are not this company. Please repeat.");
            }
        } while (true);
    }

    public static int consoleConstructingYear() {
        int enteredYear = -1;
        String message = "Enter year of construct car.";
        do {
            System.out.println(message);
            Scanner consoleIn = new Scanner(System.in);
            try {
                enteredYear = Integer.valueOf(consoleIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter invalid number. Please repeat.");
            }
            if (enteredYear < 1900 || enteredYear > 2015) {
                System.out.println("Entered year might be since 1900 to 2015.");
                enteredYear = -1;
            } else {
                return enteredYear;
            }
        } while (true);
    }

    public static int consolePrice() {
        int enteredPrice = -1;
        String message = "Enter price car:";
        do {
            System.out.println(message);
            Scanner consoleIn = new Scanner(System.in);
            try {
                enteredPrice = Integer.valueOf(consoleIn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter invalid number. Please repeat.");
            }
            if (enteredPrice < 0) {
                System.out.println("Entered price is not negative.");
                enteredPrice = -1;
            } else {
                return enteredPrice;
            }
        } while (true);
    }
}
