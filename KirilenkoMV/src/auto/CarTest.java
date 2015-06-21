package auto;


import java.sql.Date;
import java.util.*;

/**
 * Created by asus on 25.05.2015.
 * Описываем систему AutoHouse. В автохаусе на данный момент есть несколько различных машин.
 * У каждой машины свой уникальный идентификатор.
 * <p/>
 * Реализовать следующие функции.
 * 1) Добавление и удаление новых машин в/из автохаус(а).
 * 2) Поиск машин по марке.
 * 3) Поиск машин по году выпуска.
 * 4) Сортировка по году.
 * 5) Сортировка по цене.
 * <p/>
 * Реализовать консольное меню.
 */
public class CarTest {
    public static void main(String[] args) {
        AutoHauseManager manager = new AutoHauseManagerImpl();
        AutoHauseUtils utils = new AutoHauseUtilsImpl();
        List<Car> cars = new ArrayList<Car>();
        //init
        cars.add(new Car("volkswagen", "passat", Date.valueOf("2003-02-01"), 4000));
        cars.add(new Car("volkswagen", "passat", Date.valueOf("2010-02-01"), 14000));
        cars.add(new Car("opel", "astra", Date.valueOf("2011-05-01"), 7000));
        cars.add(new Car("volkswagen", "passat", Date.valueOf("2005-02-01"), 6000));
        cars.add(new Car("volkswagen", "polo", Date.valueOf("2014-02-01"), 12000));
        cars.add(new Car("volkswagen", "passat", Date.valueOf("1997-02-01"), 2000));
        cars.add(new Car("mercedes", "C200", Date.valueOf("2009-05-01"), 17000));
        cars.add(new Car("volkswagen", "polo", Date.valueOf("2003-02-01"), 8000));
        cars.add(new Car("volkswagen", "touareg", Date.valueOf("2015-05-01"), 45000));
        cars.add(new Car("mercedes", "C200", Date.valueOf("2012-05-01"), 22000));
        cars.add(new Car("volkswagen", "passat", Date.valueOf("2009-02-01"), 11000));
        cars.add(new Car("volkswagen", "touareg", Date.valueOf("2002-02-01"), 3000));
        cars.add(new Car("mercedes", "ML500", Date.valueOf("2014-05-01"), 40000));
        cars.add(new Car("volkswagen", "passat", Date.valueOf("2006-02-01"), 7000));
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("--------------------------------------------");
            System.out.println("1 - Добавление авто");
            System.out.println("2 - Удаление авто");
            System.out.println("3 - Поиск авто");
            System.out.println("4 - Список всех авто");
            System.out.println("5 - Сортировка авто по году выпуска");
            System.out.println("6 - Сортировка авто по цене (по возрастанию)");
            System.out.println("7 - Сортировка авто по марке (по убыванию)");
            System.out.println("0 - Выход");
            System.out.println();
            if (scanner.hasNextInt()) {
                int userSwitch = scanner.nextInt();
                if (userSwitch == 0) {
                    return;
                } else if (userSwitch == 1) {
                    manager.addCar(cars);
                } else if (userSwitch == 2) {
                    manager.deleteCar(cars);
                } else if (userSwitch == 3) {
                    //manager.deleteCar(cars);
                } else if (userSwitch == 4) {
                    for (Car car : cars) {
                        System.out.println(car.getId() + " : " + car.getBrand() + " " + car.getModel() + " " + car.getAge() + " " + car.getPrice());
                    }
                } else if (userSwitch == 5) {
                    //через TreeMap сортировать как-то не правильно и сильно громоздко (п.6 и 7 думаю правильнее)
                    Map<java.util.Date, List<Car>> carMap = utils.SortWithTreeMap(cars);
                    //Collections.sort(cars,Car.Comporators.AGE);
                    utils.ShowMap(carMap);
                } else if (userSwitch == 6) {
                    Collections.sort(cars, Car.Comporators.PRICE_UP);
                    utils.ShowCollection(cars);
                } else if (userSwitch == 7) {
                    Collections.sort(cars, Car.Comporators.MODEL_DOWN);
                    utils.ShowCollection(cars);
                }
            } else {
                System.out.println("Неверный выбор!");
            }

        }
    }

}
