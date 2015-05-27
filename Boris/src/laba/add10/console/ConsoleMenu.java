package laba.add10.console;


import laba.add10.autohouse.AutoHouse;
import laba.add10.autohouse.InitializeAutoHouse;

import static laba.add10.console.ConsoleMenuAutoHouse.*;

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
        System.out.println(listing.findIDCarForSpecifyYearOfIssue(getConsoleConstructingYear()));
    }

    private static void startMethodFindCarByCompany() {
        System.out.println(listing.findIDCarForSpecifyCompany(getConsoleEnumCompany()));
    }

    private static void startMethodRemoveCarInAutoHouse() {
        int removeNumberMethod = selectRemoveParameter();
        if (removeNumberMethod == 1) {
            listing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear(), getConsolePrice());
        } else if (removeNumberMethod == 2) {
            listing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear());
        } else if (removeNumberMethod == 3) {
            listing.removeCarForSpecify(getConsoleEnumCompany());
        } else if (removeNumberMethod == 4) {
            listing.removeCarForSpecify(getConsoleConstructingYear(), getConsolePrice());
        } else if (removeNumberMethod == 5) {
            listing.removeCarForSpecify(getConsoleConstructingYear());
        } else if (removeNumberMethod == 6) {
            listing.removeAllCar();
        } else if (removeNumberMethod == 7) {
            listing.removeCarForID(getConsoleID());
        }
        System.out.println("Car is deleting.");
    }

    private static void startMethodAddCar() {
        listing.addCarInAutoHouse(getConsoleEnumCompany(), getConsoleConstructingYear(),
                getConsolePrice());
        System.out.println("Car is addition.");
    }

}
