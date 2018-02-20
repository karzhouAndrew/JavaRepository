package laba.add10.console;


import laba.add10.autohouse.CompanyEnum;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleCheckInChoice {
    final static int EXIT = 0;

    public static void consoleHello() {
        new ConsoleMenuAutoHouse();
        System.out.println("Hello. You are in AutoHose menu.");
        String message = "Enter a key:\n" +
                "1 - add car in AutoHouse.\n" +
                "2 - remove car in AutoHouse.\n" +
                "3 - find car by company.\n" +
                "4 - find car by year of constructing.\n" +
                "5 - see car list in order to year of constructing.\n" +
                "6 - see car list in order to price.\n" +
                "0 - exit.";
        do {
            System.out.println(message);
            int enteredCommand = getConsoleInteger();
            if (enteredCommand > 0 && enteredCommand < 7) {
                ConsoleMenuAutoHouse.selectMethodToStart(enteredCommand);
                System.out.println("Something else? (0 - exit.)");
                if (getConsoleToExit() == EXIT) {
                    System.out.println("Goodbye.");
                    return;
                }
            } else if (enteredCommand == EXIT) {
                System.out.println("Goodbye.");
                return;
            } else {
                System.out.println("There are not this command. Please repeat.");
            }
        } while (true);
    }

    private static int getConsoleToExit() {
        Scanner consoleIn = new Scanner(System.in);
        try {
            return Integer.valueOf(consoleIn.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static CompanyEnum getConsoleEnumCompany() {
        String message = "Enter company: (" + Arrays.toString(CompanyEnum.values()) + ").";
        do {
            System.out.println(message);
            CompanyEnum company;
            try {
                company = getCompanyEnumFromString();
                return company;
            } catch (IllegalArgumentException e) {
                System.out.println("There are no this company. Please repeat.");
            }
        } while (true);
    }

    private static CompanyEnum getCompanyEnumFromString() {
        return CompanyEnum.valueOf(getConsoleString().toUpperCase());
    }

    private static String getConsoleString() {
        Scanner consoleIn = new Scanner(System.in);
        return consoleIn.nextLine();
    }

    public static int getConsoleConstructingYear() {
        String message = "Enter year of construct car.";
        do {
            System.out.println(message);
            int enteredYear = getConsoleInteger();
            if (enteredYear < 1900 || enteredYear > 2015) {
                System.out.println("Entered year might be since 1900 to 2015.");
            } else {
                return enteredYear;
            }
        } while (true);
    }

    public static int getConsolePrice() {
        String message = "Enter price car:";
        do {
            System.out.println(message);
            int enteredPrice = getConsoleInteger();
            if (enteredPrice < 0) {
                System.out.println("Entered price must be not negative.");
            } else {
                return enteredPrice;
            }
        } while (true);
    }

    private static int getConsoleInteger() {

        try {
            Scanner consoleIn = new Scanner(System.in);
            return Integer.valueOf(consoleIn.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entered invalid number. Please repeat.");
            return -1;
        }
    }

    public static int selectRemoveParameters() {
        String message = "Select characteristic, in which car would you delete:\n" +
                "1 - company, constructing year, price;\n" +
                "2 - company, constructing year;\n" +
                "3 - company;\n" +
                "4 - constructing year, price;\n" +
                "5 - constructing year;\n" +
                "6 - all cars;\n" +
                "7 - identifier;" +
                "0 - exit.";
        do {
            System.out.println(message);
            int methodCod = getConsoleInteger();
            if (methodCod > -1 && methodCod < 8) {
                return methodCod;
            }
        } while (true);
    }

    public static int getConsoleID() {
        String message = "Enter ID to remove car:";
        do {
            System.out.println(message);
            int iD = getConsoleInteger();
            if (iD > 0) {
                return iD;
            }
        } while (true);
    }
}
