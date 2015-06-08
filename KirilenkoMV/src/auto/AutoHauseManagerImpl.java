package auto;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by asus on 25.05.2015.
 */
public class AutoHauseManagerImpl implements AutoHauseManager {
    @Override
    public List<Car> addCar(List<Car> cars) {
        Car car = new Car();
        Scanner scanner;
        System.out.println("----Меню добавления авто----");
        System.out.print("Введите марку авто : ");
        car.setBrand((new Scanner(System.in)).nextLine());

        System.out.print("Введите модель авто : ");
        car.setModel((new Scanner(System.in)).nextLine());

        System.out.print("Введите год выпуска (YYYY-MM-DD) : ");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = (new Scanner(System.in)).nextLine();
        try {
            Date d = dateFormat.parse(date);
            System.out.println(d);
            car.setAge(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Введите стоимость авто : ");
        car.setPrice((new Scanner(System.in)).nextInt());

        cars.add(car);

        return cars;
    }

    @Override
    public List<Car> deleteCar(List<Car> cars) {
        System.out.println("Введити идентификатор авто, которое хотите удалить:");
        for (Car car : cars) {
            System.out.println(car.getId() + " : " + car.getBrand() + " " + car.getModel() + " " + car.getAge() + " " + car.getPrice());
        }
        //Scanner scanner;
        int id = (new Scanner(System.in)).nextInt();
        for (Car car : cars) {
            if (car.getId() == id) {
                cars.remove(car);
                return cars;
            }
        }

        System.out.println("Авто с таким идентификатором не существует!");
        return cars;
    }
}
