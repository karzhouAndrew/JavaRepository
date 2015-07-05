package module2.addShip;


import module2.addShip.mooring.Mooring;
import module2.addShip.ship.Ship;

public class TestSeaPort {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Ship ship = new Ship();
            Mooring.getMooring().moor(ship);
        }
        Mooring.getMooring().shutdown();
    }
}
