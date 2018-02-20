package add12;

import java.util.LinkedList;
import java.util.List;

/**
 * Система порт.
 * Корабли заходят в порт для разгрузки или загрузки контейнеров и швартуются к причалам.
 * У каждого причала может стоять только один корабль. Контейнеры перегружаются с корабля
 * на склад или со склада на корабль. Число контейнеров не может превышать емкость склада или корабля.
 */

public class Add12 {
    public static void main(String[] args) throws InterruptedException {
        ServicePort servicePort = new ServicePort();
        List<Item> catalogGood = servicePort.createCatalogGoods();
        Storage storage = Storage.createStorage(catalogGood.size(), catalogGood);
        servicePort.printStorage("Товары на складе", storage);
        LinkedList<Berth> catalogBerth = servicePort.createBerths();
        servicePort.createShips(storage, catalogBerth);
        Thread.currentThread().sleep(2000);
        servicePort.printStorage("Товары на складе после визита кораблей ", storage);
    }
}