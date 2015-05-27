package laba.add10.console;


import laba.add10.autohouse.AutoHouse;
import laba.add10.autohouse.InitializeAutoHouse;

public class ConsoleMenu {
    private static final int quantityCars = 10;
    private static AutoHouse listing = InitializeAutoHouse.generateQuantityCarInAutoHouse(quantityCars);

    public static void startMethod(int methodNumber) {
        if (methodNumber == 1) {
            startMethodAddCar();
        } else if (methodNumber == 2) {
            startMethodRemoveCarInAutoHouse();
        } else if (methodNumber == 3) {
            startMethodFindCarByCompany();
        } else if (methodNumber == 4) {
            startMethodFindCarByConstructingYear();
        } else if (methodNumber == 5) {
            startMethodGetListCarSortByConstructingYear();
        } else if (methodNumber == 6) {
            startMethodGetListCarSortByPrice();
        }
    }

    private static void startMethodGetListCarSortByPrice() {
        System.out.println(listing.getCarSortPrice());
    }

    private static void startMethodGetListCarSortByConstructingYear() {
        System.out.println(listing.getIDSortYearOfIssue());
    }

    private static void startMethodFindCarByConstructingYear() {
        System.out.println(listing.findIDCarForSpecifyYearOfIssue(ConsoleMenuAutoHouse.consoleConstructingYear()));
    }

    private static void startMethodFindCarByCompany() {
        System.out.println(listing.findIDCarForSpecifyCompany(ConsoleMenuAutoHouse.enumConsoleCompany()));
    }

    private static void startMethodRemoveCarInAutoHouse() {
//Console for choice method.
    }

    private static void startMethodAddCar() {
        listing.addCarInAutoHouse(ConsoleMenuAutoHouse.enumConsoleCompany(), ConsoleMenuAutoHouse.consoleConstructingYear(),
                ConsoleMenuAutoHouse.consolePrice());
    }

}
