package laba.add10.console;


import laba.add10.autohouse.AutoHouse;
import laba.add10.autohouse.InitializeAutoHouse;

import static laba.add10.console.ConsoleCheckInChoice.*;

public class ConsoleMenuAutoHouse {
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
        System.out.println(listing.getCarSortByPrice());
    }

    private static void startMethodGetListCarSortByConstructingYear() {
        System.out.println(listing.getIDSortByConstructYear());
    }

    private static void startMethodFindCarByConstructingYear() {
        System.out.println(listing.findIDCarForSpecifyConstructYear(getConsoleConstructingYear()));
    }

    private static void startMethodFindCarByCompany() {
        System.out.println(listing.findIDCarForSpecifyCompany(getConsoleEnumCompany()));
    }

    private static void startMethodRemoveCarInAutoHouse() {
        int removeNumberMethod = selectRemoveParameter();
        if (removeNumberMethod == 1) {
            listing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear(), getConsolePrice());
        } else if (removeNumberMethod == 2) {
            listing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear(), -1);
        } else if (removeNumberMethod == 3) {
            listing.removeCarForSpecify(getConsoleEnumCompany(), -1, -1);
        } else if (removeNumberMethod == 4) {
            listing.removeCarForSpecify(null, getConsoleConstructingYear(), getConsolePrice());
        } else if (removeNumberMethod == 5) {
            listing.removeCarForSpecify(null, getConsoleConstructingYear(), -1);
        } else if (removeNumberMethod == 6) {
            listing.removeAllCar();
        } else if (removeNumberMethod == 7) {
            listing.removeCarForID(getConsoleID());
        } else if (removeNumberMethod == 0) {
            return;
        }
        System.out.println("Car was deleted.");
    }

    private static void startMethodAddCar() {
        listing.addCarInAutoHouse(getConsoleEnumCompany(), getConsoleConstructingYear(),
                getConsolePrice());
        System.out.println("Car was added.");
    }

}
