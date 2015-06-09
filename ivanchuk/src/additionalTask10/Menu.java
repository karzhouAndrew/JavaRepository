package additionalTask10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuItem> items;
    private boolean isExit;

    public Menu() {
        items = new ArrayList<MenuItem>();
        addItem(new MenuItem("Добавить авто.") {
            @Override
            public void run(Scanner scanner, AutoHouse autoHouse) {
                System.out.println("Введите марку.");
                String brand = scanner.next();
                System.out.println("Введите год выпуска.");
                int releaseYear = scanner.nextInt();
                System.out.println("Введите цену.");
                int price = scanner.nextInt();
                System.out.println(autoHouse.addCar(brand, releaseYear, price, 2015));
            }
        });
        addItem(new MenuItem("Удалить авто.") {
            @Override
            public void run(Scanner scanner, AutoHouse autoHouse) {
                System.out.println("Введите ID.");
                int id = scanner.nextInt();
                System.out.println(autoHouse.removeCar(id));
            }
        });
        addItem(new MenuItem("Найти авто по марке.") {
            @Override
            public void run(Scanner scanner, AutoHouse autoHouse) {
                System.out.println("Введите марку.");
                String brand = scanner.next();
                System.out.println(autoHouse.searchByBrand(brand));
            }
        });
        addItem(new MenuItem("Найти авто по году выпуска.") {
            @Override
            public void run(Scanner scanner, AutoHouse autoHouse) {
                System.out.println("Введите год выпуска.");
                int releaseYear = scanner.nextInt();
                System.out.println(autoHouse.searchByReleaseYear(releaseYear));
            }
        });
        addItem(new MenuItem("Сортировать авто по дате добавления.") {
            @Override
            public void run(Scanner scanner, AutoHouse autoHouse) {
                System.out.println(autoHouse.sortedByYear());
            }
        });
        addItem(new MenuItem("Сортировать по цене.") {
            @Override
            public void run(Scanner scanner, AutoHouse autoHouse) {
                System.out.println(autoHouse.sortedByPrice());
            }
        });
        addItem(new MenuItem("Выход.") {
            @Override
            public void run(Scanner scanner, AutoHouse autoHouse) {
                isExit = true;
            }
        });
    }

    private void addItem(MenuItem item) {
        items.add(item);
    }

    private void printMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + " - " + items.get(i).getNameItem());
        }
    }

    public void run(Scanner scanner, AutoHouse autoHouse) {
        while (!isExit) {
            printMenu();
            int choice = scanner.nextInt();
            MenuItem item = items.get(choice - 1);
            item.run(scanner, autoHouse);
        }
    }
}
