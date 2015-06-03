package laba.add10.console;


import laba.add10.autohouse.AutoHouse;
import laba.add10.autohouse.InitializeAutoHouse;

import static laba.add10.console.ConsoleCheckInChoice.*;

public class ConsoleMenuAutoHouse {
    private static final int quantityCars = 10;
    private static AutoHouse carListing = InitializeAutoHouse.generateQuantityCarInAutoHouse(quantityCars);

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
        System.out.println(carListing.getCarSortByPrice());
    }

    private static void startMethodGetListCarSortByConstructingYear() {
        System.out.println(carListing.getIDSortByConstructYear());
    }

    private static void startMethodFindCarByConstructingYear() {
        System.out.println(carListing.findIDCarForSpecifyConstructYear(getConsoleConstructingYear()));
    }

    private static void startMethodFindCarByCompany() {
        System.out.println(carListing.findIDCarForSpecifyCompany(getConsoleEnumCompany()));
    }

    private static void startMethodRemoveCarInAutoHouse() {
        int removeNumberMethod = selectRemoveParameter();
        if (removeNumberMethod == 1) {
            carListing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear(), getConsolePrice());
        } else if (removeNumberMethod == 2) {
            carListing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear(), -1);
        } else if (removeNumberMethod == 3) {
            carListing.removeCarForSpecify(getConsoleEnumCompany(), -1, -1);
        } else if (removeNumberMethod == 4) {
            carListing.removeCarForSpecify(null, getConsoleConstructingYear(), getConsolePrice());
        } else if (removeNumberMethod == 5) {
            carListing.removeCarForSpecify(null, getConsoleConstructingYear(), -1);
        } else if (removeNumberMethod == 6) {
            carListing.removeAllCar();
        } else if (removeNumberMethod == 7) {
            carListing.removeCarForID(getConsoleID());
        } else if (removeNumberMethod == 0) {
            return;
        }
        System.out.println("Car was deleted.");
    }

    private static void startMethodAddCar() {
        carListing.addCarInAutoHouse(getConsoleEnumCompany(), getConsoleConstructingYear(),
                getConsolePrice());
        System.out.println("Car was added.");
    }

}
