package additionalTask10;

//Описываем систему AutoHouse.
//В автохаусе на данный момент есть несколько различных машин.
//У каждой машины свой уникальный идентификатор.
//Реализовать следующие функции.
//1) Добавление и удаление новых машин в/из автохаус(а).
//2) Поиск машин по марке.
//3) Поиск машин по году выпуска.
//4) Сортировка по году.
//5) Сортировка по цене.
//Реализовать консольное меню.

import java.util.Scanner;

public class AutoHouseMenu {
    public static void main(String[] args) {
        AutoHouse autoHouse = new AutoHouse(10);
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();
        menu.run(in, autoHouse);
        in.close();
    }
}
