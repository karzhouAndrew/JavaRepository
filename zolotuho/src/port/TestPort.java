package port;


import java.util.concurrent.TimeUnit;
//Задание: Создать многопоточное приложение корректно работающее с разделяемыми ресурсами и избегающие ситуации взаимной блокировки.
// Любая сущность, желающая получить доступ к разделяемому ресурсу, должна быть потоком Система порт.
// Корабли заходят в порт для разгрузки или загрузки контейнеров и швартуются к причалам.
// У каждого причала может стоять только один корабль. Контейнеры перегружаются с корабля на склад или со склада на корабль.
// Число контейнеров не может превышать емкость склада или корабля.
public class TestPort {
    public static void main(String[] args) throws InterruptedException {
        int shipQueueLength = 50;
        int shipCapacity = 100;
        int delayShipAppearance = 11;
        ShipGenerator shipGenerator = new ShipGenerator(shipQueueLength, shipCapacity, delayShipAppearance);
        int storeCapacity = 10000;
        Store store = new Store(storeCapacity);
        store.setRemainedCapacity(5000);
        int servingShipTime = 500;
        int docksQuantity = 20;
        Port port = new Port(store, shipGenerator, docksQuantity, servingShipTime);
        port.startWork();
        TimeUnit.SECONDS.sleep(20);
        port.stopWork(1);
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(store);
    }
}
