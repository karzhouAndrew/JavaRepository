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
        int enteredCommand = -1;
        do {
            enteredCommand = getConsoleInteger();
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

    public static CompanyEnum getConsoleEnumCompany() {
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

    public static int getConsoleConstructingYear() {
        int enteredYear = -1;
        String message = "Enter year of construct car.";
        do {
            System.out.println(message);
            enteredYear = getConsoleInteger();
            if (enteredYear < 1900 || enteredYear > 2015) {
                System.out.println("Entered year might be since 1900 to 2015.");
                enteredYear = -1;
            } else {
                return enteredYear;
            }
        } while (true);
    }

    public static int getConsolePrice() {
        int enteredPrice = -1;
        String message = "Enter price car:";
        do {
            System.out.println(message);
            enteredPrice = getConsoleInteger();
            if (enteredPrice < 0) {
                System.out.println("Entered price must be not negative.");
                enteredPrice = -1;
            } else {
                return enteredPrice;
            }
        } while (true);
    }

    private static int getConsoleInteger() {
        Scanner consoleIn = new Scanner(System.in);
        try {
            return Integer.valueOf(consoleIn.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entered invalid number. Please repeat.");
            return -1;
        }
    }

    public static int selectRemoveParameter(){
        int methodCod = 0;
        String message = "Select characteristic, in which car would you delete:\n" +
                "1 - company, constructing year, price;\n" +
                "2 - company, constructing year;\n" +
                "3 - company;\n" +
                "4 - constructing year, price;\n" +
                "5 - constructing year;\n" +
                "6 - all cars;\n" +
                "7 - identifier.";
        do {
            System.out.println(message);
            methodCod = getConsoleInteger();
            if (methodCod > 0 && methodCod < 8){
                return methodCod;
            }
        } while (true);
    }

    public static int getConsoleID (){
        int iD = 0;
        String message = "Enter ID to remove car:";
        do {
            System.out.println(message);
            iD = getConsoleInteger();
            if (iD > 0 ){
                return iD;
            }
        } while (true);
    }
}
