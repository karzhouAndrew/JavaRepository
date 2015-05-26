package extraLab10;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestAutoHouse {

    public static void main(String[] args) {
        AutoHouse autoHouse = new AutoHouse();
        //System.out.println(autoHouse);
        //Map<Integer, Car> car = autoHouse.getCarMap();
        //System.out.println(car.values());
        //System.out.println(autoHouse.getByBrand());
        //autoHouse.getByBrand("Mazda").get(1);
        //System.out.println(autoHouse.getCarsByBrand("Mazda"));
        //System.out.println(autoHouse.getByBrand("Mazda").get(1).getBrandName());
        //System.out.println(autoHouse.getCarsByYear(2000));
        System.out.println(autoHouse. getSortedCarsByPrice());
        //System.out.println(autoHouse.getSortedCars());

        Scanner scanner = new Scanner(System.in);

        String input;

        if (scanner.hasNext()) {
            input = scanner.next();
        }



    }


}
