package jd02.port;

public class Main {
    public static void main(String[] args) {
        //Berth berth1 = new Berth();
        //Berth berth2 = new Berth();
        //Berth berth3 = new Berth();

        Storage storage = Storage.getInstance();

        //Runnable ship = new Ship();
        Ship ship = new Ship();

        Flotilla flotilla = new Flotilla(20);
        Ship nextShip = flotilla.getNextShip();


        Runnable berth = new Berth();
        Thread thread = new Thread(berth);
        thread.start();
    }

}
