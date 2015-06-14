package addLab10;


import java.util.Scanner;


/**
 * Описываем систему AutoHouse. В автохаусе на данный момент есть несколько различных машин. У каждой машины свой уникальный идентификатор.
 * <p/>
 * Реализовать следующие функции.
 * +1) Добавление и удаление новых машин в/из автохаус(а).
 * +2) Поиск машин по марке.
 * +3) Поиск машин по году выпуска.
 * +4) Сортировка по году.
 * +5) Сортировка по цене.
 * <p/>
 * Реализовать консольное меню.
 */
public class Task {
    public static void main(String[] args) {
        Menu menu = new Menu();
        AutoHouse autoHouse = new AutoHouse();
        Scanner input = new Scanner(System.in);
        menu.menuProcessing(autoHouse);
        autoHouse.defaultCarMap();
        do {
            menu.printMenu();
            int choise = input.nextInt();
            if (choise == 0) {
                break;
            } else {
                menu.choiseProcessing(autoHouse, choise);
            }
        } while (true);
        input.close();
    }
}
