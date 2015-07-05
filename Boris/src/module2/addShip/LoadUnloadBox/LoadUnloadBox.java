package module2.addShip.LoadUnloadBox;


import module2.addShip.box.Box;
import module2.addShip.mooring.Mooring;
import module2.addShip.ship.Ship;
import module2.addShip.ship.exception.EmptyHoldException;
import module2.addShip.ship.exception.FullHoldException;
import module2.addShip.store.Store;
import module2.addShip.store.exception.EmptyStoreException;
import module2.addShip.store.exception.FullStoreException;

public class LoadUnloadBox {

    public static void start(Ship ship) {
        if (ship.isLoad()) {
            loadBoxes(ship);
        } else {
            unloadBoxes(ship);
        }
    }

    private static void unloadBoxes(Ship ship) {
            Box box = null;
            try {
                while (true) {
                    box = ship.unloadBox();
                    Store.getStore().addBox(box);
                }
            } catch (FullStoreException e) {
                System.out.println("Store is full. Ship is out.");
                ship.loadBox(box);
//                Mooring.getMooring().moor(ship);
            } catch (EmptyHoldException e) {
                System.out.println("Ship is empty. Sink.");
            }
    }


    private static void loadBoxes(Ship ship) {
            Box box = null;
            try {
                while (true) {
                    box = Store.getStore().removeBox();
                    ship.loadBox(box);
                }
            } catch (FullHoldException e) {
                System.out.println("Ship is full. Sink.");
                Store.getStore().addBox(box);
            } catch (EmptyStoreException e) {
                System.out.println("Store is empty. Ship is out.");
//                Mooring.getMooring().moor(ship);
            }
        }
}
