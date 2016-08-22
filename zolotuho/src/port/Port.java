package port;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Port {
    private List<Dock> docks;
    private Store store;
    private ShipGenerator shipGenerator;
    private ExecutorService docksExecutor;
    private ExecutorService shipsExecutor;

    public Port(Store store, ShipGenerator shipGenerator, int dockQuantity, int speedLoading) {
        this.store = store;
        this.shipGenerator = shipGenerator;
        docks = new ArrayList<>();
        for (int i = 0; i < dockQuantity; i++) {
            docks.add(new Dock(shipGenerator, store, speedLoading));
        }
    }

    public List<Dock> getDocks() {
        return docks;
    }

    public void setDocks(List<Dock> docks) {
        this.docks = docks;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void startWork() {
        Thread generatorThread = new Thread(shipGenerator);
        docksExecutor = Executors.newCachedThreadPool();
        shipsExecutor = Executors.newCachedThreadPool();
        shipsExecutor.execute(generatorThread);

        for (int i = 0; i < docks.size(); i++) {
            docksExecutor.execute(docks.get(i));
        }
    }

    public void stopWork(int finishTime) {
        shipGenerator.setGenerate(false);
        try {
            TimeUnit.SECONDS.sleep(finishTime);
            shipsExecutor.shutdownNow();
            TimeUnit.SECONDS.sleep(finishTime);
            docksExecutor.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
