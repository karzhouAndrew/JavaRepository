package jd02.port;

public class Berth implements Runnable {
    private int serviceTime = Util.generateRandomInt(500, 1000);
    private Ship currentShip;

    public Berth(Ship currentShip) {
        this.currentShip = currentShip;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(serviceTime);
            Storage.INSTANCE.serve(currentShip);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
