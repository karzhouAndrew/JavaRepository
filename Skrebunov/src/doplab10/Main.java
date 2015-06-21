package doplab10;

 /*
 1) Добавление и удаление новых машин в/из автохаус(а).
2) Поиск машин по марке.
3) Поиск машин по году выпуска.
4) Сортировка по году.
5) Сортировка по цене.
 */

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Car> hm = new HashMap<Integer, Car>();
        hm.put(Car.getIdentifierStatic(), new Car("bmw", "2", 100, 2010, 2009, 0));
        hm.put(Car.getIdentifierStatic(), new Car("bmw", "3", 250, 2009, 2009, 0));
        hm.put(Car.getIdentifierStatic(), new Car("bmw", "5", 300, 2005, 2007, 0));
        hm.put(Car.getIdentifierStatic(), new Car("audi", "A6", 100, 2010, 2010, 0));
        hm.put(Car.getIdentifierStatic(), new Car("audi", "A6", 120, 2011, 2011, 0));
        Sorting empty = new Sorting();
        empty.sorting(hm);
    }
}