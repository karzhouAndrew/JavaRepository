package port;

/**
 * Created by Master on 24.06.2015.
 */
public class Store {
    public final static int TOTAL_SPACE_STORE = 1600;
    public static int freeSpaceStore = 700;

    public Store() {
    }

    public static int getFreeSpaceStore() {
        return freeSpaceStore;
    }

    public static int getTotalSpaceStore() {
        return TOTAL_SPACE_STORE;
    }


    public int shipment(int numberContainers) {
        System.out.println();
        int resulShipment = 0;
        if (numberContainers > freeSpaceStore) {
            resulShipment = freeSpaceStore;
            freeSpaceStore = 0;
        } else {
            resulShipment = numberContainers;
            freeSpaceStore = freeSpaceStore - numberContainers;
        }
        return resulShipment;
    }

    public int unloading(int numberContainer) {
        int resulShipment = 0;
        if (numberContainer > (TOTAL_SPACE_STORE - freeSpaceStore)) {
            resulShipment = TOTAL_SPACE_STORE - freeSpaceStore;
            freeSpaceStore = TOTAL_SPACE_STORE;
        } else {
            resulShipment = numberContainer;
            freeSpaceStore = freeSpaceStore + numberContainer;
        }
        return resulShipment;
    }
}
