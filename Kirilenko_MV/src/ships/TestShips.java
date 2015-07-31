package ships;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Created by champion on 27.06.15.
 * Корабли выгружают/загружают контейнеры в порту. Один причал обслуживает один корабль. Количество кораблей больше количества
 * причал, но не может одновременно обслуживаться больше кораблей, чем количество причал, количество контейнеров в порту
 * не может быть больше максимального ограничения.
 * Задача сводится к паттерну productions/consumers. Стэк контейнеров в порту ограничиваем 100, изначально на складе 50 контейнеров.
 * Нечетные корабли пустые - в них загружаем 20 контейнеров. Если контейнеров не хватает, заставляем поток заснуть wait.
 * Четные корабли заполнены рандомно ( от 0 до 40 контейнеров) - их разгружаем. Если в порту не хватает места, заставляем поток заснуть.
 *
 */
public class TestShips{
    public static void main(String[] args) {
       int numberShips = 100;
        Queue<Ship> ships = new LinkedList<>();

        Random random = new Random();
        for (int i = 1; i < numberShips; i=i+2) {
            Ship shipFull = new Ship(random.nextInt(40),String.valueOf(i));
            ships.add(shipFull);
            int num=i+1;
            Ship shipEmpty = new Ship(0,String.valueOf(num));
            ships.add(shipEmpty);
        }

        for (int i = 0; i < 5; i++) {
            Port port = new Port(i,ships);
            port.start();
        }
        /*semaphore{
            //5 потоков одновременно
            new Thread(new Producer(buffer)).start();
            or
            new Thread(new Customer(buffer)).start();

        }
        */

    }
}