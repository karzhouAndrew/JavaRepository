package laba.add10.console;


import laba.add10.autohouse.AutoHouse;
import laba.add10.autohouse.InitializeAutoHouse;
import laba.add10.exeption.NullListException;

import static laba.add10.console.ConsoleCheckInChoice.*;

public class ConsoleMenuAutoHouse {
    private static final int quantityCars = 10;
    private static AutoHouse carsListing = getCarsInAutoHouse();

    private static AutoHouse getCarsInAutoHouse() {
        return InitializeAutoHouse.generateQuantityCarInAutoHouse(quantityCars);
    }

    public static void selectMethodToStart(int methodNumber) {
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
        try {
            System.out.println(carsListing.getCarSortByPrice());
        } catch (NullListException e) {
            System.out.println("There are no cars in listing AutoHouse.");
        }
    }

    private static void startMethodGetListCarSortByConstructingYear() {
        try {
            System.out.println(carsListing.getIDSortByConstructYear());
        } catch (NullListException e) {
            System.out.println("There are no cars in listing AutoHouse.");
        }
    }

    private static void startMethodFindCarByConstructingYear() {
        try {
            System.out.println(carsListing.findIDCarForSpecifyConstructYear(getConsoleConstructingYear()));
        } catch (NullListException e) {
            System.out.println("There are no cars with this year of constructing in listing AutoHouse.");
        }
    }

    private static void startMethodFindCarByCompany() {
        try {
            System.out.println(carsListing.findIDCarForSpecifyCompany(getConsoleEnumCompany()));
        } catch (NullListException e) {
            System.out.println("There are no cars this company in listing AutoHouse.");
        }
    }

    private static void startMethodRemoveCarInAutoHouse() {
        int selectedMethod = selectRemoveParameters();
       try {
           if (selectedMethod == 1) {
               carsListing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear(), getConsolePrice());
           } else if (selectedMethod == 2) {
               carsListing.removeCarForSpecify(getConsoleEnumCompany(), getConsoleConstructingYear(), -1);
           } else if (selectedMethod == 3) {
               carsListing.removeCarForSpecify(getConsoleEnumCompany(), -1, -1);
           } else if (selectedMethod == 4) {
               carsListing.removeCarForSpecify(null, getConsoleConstructingYear(), getConsolePrice());
           } else if (selectedMethod == 5) {
               carsListing.removeCarForSpecify(null, getConsoleConstructingYear(), -1);
           } else if (selectedMethod == 6) {
               carsListing.removeAllCar();
           } else if (selectedMethod == 7) {
               carsListing.removeCarForID(getConsoleID());
           } else if (selectedMethod == 0) {
               return;
           }
       } catch (NullListException e){
           System.out.println("There are no cars with this ID in listing AutoHouse.");
       }
        System.out.println("Cars were deleted.");
    }

    private static void startMethodAddCar() {
        carsListing.addCarInAutoHouse(getConsoleEnumCompany(), getConsoleConstructingYear(),
                getConsolePrice());
        System.out.println("Car was added.");
    }

}
