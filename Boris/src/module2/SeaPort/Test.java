package module2.SeaPort;


import module2.SeaPort.mooring.Mooring;
import module2.SeaPort.ship.Ship;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            Ship ship = new Ship();
            Mooring.getMooring().moor(ship);
        }
        Mooring.getMooring().shutdown();
    }
}
