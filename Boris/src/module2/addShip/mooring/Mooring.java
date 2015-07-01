package module2.addShip.mooring;


import sun.nio.ch.ThreadPool;

public class Mooring {
    private static Mooring mooring;
    private ThreadPool pool;

    private Mooring() {

    }

    public synchronized static Mooring getMooring() {
        if (mooring == null){
            mooring = new Mooring();
        }
        return mooring;
    }


}
