package port;




import java.util.LinkedList;
import java.util.Queue;

/**
 * Дополнительное задание "Порт".
 */
public class RunPort {
    public static void main(String[] args) throws InterruptedException {
        Queue<Sheep> queueSheep = new LinkedList<>();
        queueSheep.add(new Sheep("Sea-gull", 50, 10, true));
        queueSheep.add(new Sheep("Ghost", 20, 10, true));
        queueSheep.add(new Sheep("Storm", 70, 20, false));
        queueSheep.add(new Sheep("Ocean", 500, 100, false));
        queueSheep.add(new Sheep("Brain", 200, 110, true));
        queueSheep.add(new Sheep("Maria", 400, 100, false));
        queueSheep.add(new Sheep("Madrid", 200, 100, true));
        queueSheep.add(new Sheep("Minsk", 500, 100, false));
        queueSheep.add(new Sheep("Moskva", 200, 110, true));
        queueSheep.add(new Sheep("Kiev", 400, 100, false));
        queueSheep.add(new Sheep("London", 200, 100, true));


        Store store = new Store();
        System.out.println("Свободное место на складе " + store.getFreeSpaceStore()) ;

        LinkedList<Dock> listDock = new LinkedList<Dock>();
        listDock.add(new Dock(store, "Причал №1"));
        listDock.add(new Dock(store, "Причал №2"));
        listDock.add(new Dock(store, "Причал №3"));

        PoolDocks<Dock> docks = new PoolDocks<>(listDock);

        while (queueSheep.size() != 0) {

            Sheep sheep = queueSheep.poll();
            sheep.setPool(docks);
            sheep.start();
        }
    }
}
