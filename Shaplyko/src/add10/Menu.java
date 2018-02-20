package add10;

import java.util.Scanner;

public class Menu {

    public void conclusionMenu() {
        System.out.println("Выберите пункт меню: ");
        System.out.println("1. Добавление машины в базу данных.");
        System.out.println("2. Удаление машины из базы данных.");
        System.out.println("3. Поиск машины по марке.");
        System.out.println("4. Поиск машины по году выпуска.");
        System.out.println("5. Сортировать машины по году.");
        System.out.println("6. Сортировать машины по цене.");
        System.out.println("7. Распечатать базу данных.");
        System.out.println("8. Выйти из программы.");
    }

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        ProcessingAuto processingAuto = new ProcessingAuto();
        processingAuto.startAutoHouse();
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    processingAuto.additionVehicle();
                    break;
                case 2:
                    processingAuto.removeCar();
                    break;
                case 3:
                    processingAuto.brandFind();
                    break;
                case 4:
                    processingAuto.graduationYearFind();
                    break;
                case 5:
                    processingAuto.graduationYearSort();
                    break;
                case 6:
                    processingAuto.priceSort();
                    break;
                case 7:
                    processingAuto.printAutoHouse();
                    break;
                case 8:
                    scanner.close();
                    break;
                default:
                    System.out.println("Такого пункта в меню нет, попробуйте еще раз");
            }
        }
    }
}

