package autohouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Master on 30.05.2015.
 */
public class Menu {
    private Map<Integer, Auto> autoList = new HashMap<Integer, Auto>();

    {
        Auto auto1 = new Auto("Ford", 2008, 7800);
        Auto auto2 = new Auto("Fiat", 2012, 8000);
        Auto auto3 = new Auto("Citroen", 2000, 2800);
        Auto auto4 = new Auto("Mazda", 2009, 1000);
        Auto auto5 = new Auto("Honda", 2013, 15000);
        Auto auto6 = new Auto("Ford", 2009, 9000);
        Auto auto7 = new Auto("Audi", 2000, 5800);
        Auto auto8 = new Auto("Ford", 2000, 2800);

        autoList.put(auto1.getId(), auto1);
        autoList.put(auto2.getId(), auto2);
        autoList.put(auto3.getId(), auto3);
        autoList.put(auto4.getId(), auto4);
        autoList.put(auto5.getId(), auto5);
        autoList.put(auto6.getId(), auto6);
        autoList.put(auto7.getId(), auto7);
        autoList.put(auto8.getId(), auto8);
    }

    public void menuCar() {
        System.out.println("Меню АвтоХауз");
        System.out.println("Для добавления автомобиля введите 1");
        System.out.println("Для удаления автомобиля введите 2");
        System.out.println("Для поиска автомобиля по цене введите 3");
        System.out.println("Для поиска автомобиля по году выпуска введите 4");
        System.out.println("Для сортировки автомобилей по году выпуска введите 5");
        System.out.println("Для сортировки автомобилей по году выпуска введите 6");
        System.out.println("Для выхода из меню введите 0");
        System.out.println();
        System.out.println("Выберите один из пунктов меню");
        chooseMenu();
    }

    public void chooseMenu() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        AutoHouse autoHouse = new AutoHouse();

        if (number == 1) {
            System.out.println("Введите марку автомобиля");
            String name = scanner.next();
            System.out.println("Введите год выпуска автомобиля");
            int carYear = scanner.nextInt();
            System.out.println("Введите цену автомобиля");
            int carPrice = scanner.nextInt();
            Auto newAuto = new Auto(name, carYear, carPrice);
            autoList.put(newAuto.getId(), newAuto);
            System.out.println("Для выхода в главное меню нажмите 7");
            number = scanner.nextInt();
        } else if (number == 2) {
            System.out.println("Введите ID автомобиля для удаления из списка");
            int id = scanner.nextInt();
            autoHouse.removeAuto(autoList, id);
            System.out.println("Для выхода в главное меню нажмите 7");
            number = scanner.nextInt();
        } else if (number == 3) {
            System.out.println("Введите цену автомобиля для поиска");
            int price = scanner.nextInt();
            System.out.println(autoHouse.searchCarByPrice(autoList, price));
            System.out.println("Для выхода в главное меню нажмите 7");
            number = scanner.nextInt();
        } else if (number == 4) {
            System.out.println("Введите год автомобиля для поиска");
            int year = scanner.nextInt();
            System.out.println(autoHouse.searchCarByYear(autoList, year));
            System.out.println("Для выхода в главное меню нажмите 7");
            number = scanner.nextInt();
        } else if (number == 5) {
            System.out.println("Сортировка автомобилей по году выпуска");
            autoHouse.sortAutoByYear(autoList);
            System.out.println("Для выхода в главное меню нажмите 7");
            number = scanner.nextInt();
        } else if (number == 6) {
            System.out.println("Сортировка автомобилей по цене");
            autoHouse.sortAutoByPrice(autoList);
            System.out.println("Для выхода в главное меню нажмите 7");
            number = scanner.nextInt();
        } else if (number == 0) {
            scanner.close();
        } else {
            System.out.println("Вы выбрали не существующий пункт в меню");
            menuCar();
        }

        if (number == 7) {
            menuCar();
        }

    }
}
