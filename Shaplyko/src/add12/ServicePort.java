package add12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ServicePort {

    public void printStorage(String title, Storage storage) {
        System.out.println(title);
        Iterator<Item> goodIterator = storage.iterator();
        while (goodIterator.hasNext()) {
            System.out.print(goodIterator.next().getRegistrationNumber() + " ");
        }
        System.out.println();
    }

    public List<Item> createCatalogGoods() {
        Item[] goods = new Item[20];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Item(i + 1);
        }
        return Arrays.asList(goods);
    }

    public LinkedList<Berth> createBerths() {
        return new LinkedList<Berth>() {
            {
                this.add(new Berth(1));
                this.add(new Berth(2));
                this.add(new Berth(3));
                this.add(new Berth(4));
                this.add(new Berth(5));
            }
        };
    }

    public void createShips(Storage storage, LinkedList<Berth> list) {
        BerthPool<Berth> pool = new BerthPool<>(list);
        for (int i = 0; i < 6; i++) {
            new Ship(pool, 3, storage).start();
        }

        for (int i = 0; i < 3; i++) {
            new Ship(pool, storage).start();
        }
    }
}
