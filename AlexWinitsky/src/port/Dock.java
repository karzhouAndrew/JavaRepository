package port;

/**
 * Created by Master on 24.06.2015.
 */
public class Dock {
    private final Store store;
    private String name;

    public String getName() {
        return name;
    }

    public Dock(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    public void sheepmetStore(Sheep sheep) {
        int tempFreesSpaceSore = store.freeSpaceStore;
        if (sheep.getTotalSpace() == sheep.getFreeSpace()) {
            store.shipment(sheep.getFreeSpace());
            sheep.unloadingSheep(store.freeSpaceStore);
        } else {
            store.shipment(sheep.getTotalSpace() - sheep.getFreeSpace());
            sheep.unloadingSheep(tempFreesSpaceSore);
        }
    }

    public void uploadingStore(Sheep sheep) {
        int tempFreesSpaceSore = store.freeSpaceStore;
        store.unloading(sheep.getFreeSpace());
        sheep.shipmentSheep(store.TOTAL_SPACE_STORE - tempFreesSpaceSore);
    }

    public void shipmentUploading(Sheep sheep) {
        try {
            Thread.sleep(new java.util.Random().nextInt(100));
            if (sheep.getShipment()) {
                uploadingStore(sheep);
            } else {
                sheepmetStore(sheep);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
