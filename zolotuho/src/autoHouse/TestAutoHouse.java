package autoHouse;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestAutoHouse {
    public static void main(String[] args) {

        Map<Integer, Car> cars = new HashMap<Integer, Car>();
        Car[] car = new Car[11];
        car[0] = new Car("1234738g0ooo0", new GregorianCalendar(2015, 1, 3), "toyota", "red", 2000);
        car[1] = new Car("1ws4738g08230", new GregorianCalendar(1995, 9, 9), "mercedes", "yellow", 4800);
        car[2] = new Car("qqqqqq8g08230", new GregorianCalendar(1959, 11, 30), "BMW", "red", 18600);
        car[3] = new Car("hhhh738g08230", new GregorianCalendar(2000, 10, 13), "mercedes", "white", 8200);
        car[4] = new Car("129kk38g0lll0", new GregorianCalendar(2000, 2, 9), "volkswagen", "green", 8200);
        car[5] = new Car("1294738g08230", new GregorianCalendar(2007, 2, 7), "renault", "red", 5500);
        car[6] = new Car("1dfgsg8g08230", new GregorianCalendar(2011, 5, 6), "peugeot", "red", 3580);
        car[7] = new Car("0908777g08230", new GregorianCalendar(2014, 3, 24), "volvo", "black", 2000);
        car[8] = new Car("9877738g08230", new GregorianCalendar(2014, 10, 27), "audi", "gray", 21000);
        car[9] = new Car("4656738g08230", new GregorianCalendar(2015, 6, 11), "citroen", "black", 12000);
        car[10] = new Car("3333738g08230", new GregorianCalendar(2015, 12, 2), "volvo", "red", 15000);
        for (int i = 0; i < 6; i++) {
            cars.put(i, car[i]);
        }
        AutoHouse autoHouse = new AutoHouse((HashMap) cars);
        Scanner input = new Scanner(System.in);
        boolean exitFlag = true;
        do {
            System.out.println("Enter command, please");
            System.out.println("add - add car");
            System.out.println("del - delete car");
            System.out.println("searchbr - search by brand");
            System.out.println("searchyr - search by year");
            System.out.println("sortyear - sort by year");
            System.out.println("sortpr - sort by price");
            System.out.println("show - show cars");
            System.out.println("exit");

            if (input.hasNextLine()) {
                try {
                    String enteredLine = input.nextLine();
                    if (enteredLine.equals("exit")) {
                        exitFlag = false;
                    } else {
                        AutoHouseMenu.valueOf(enteredLine.toUpperCase()).menuFunction(autoHouse);
                    }

                } catch (Exception e) {
                    System.out.println("Invalid command");
                }
            }
        } while (exitFlag);
        input.close();
    }
}
