package module2.addShip.ship;


import module2.addShip.box.Box;
import module2.addShip.ship.exception.EmptyHoldException;
import module2.addShip.ship.exception.FullHoldException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private boolean load;
    private int maxCapacity;
    private final static int maxGenerateCapacity = 10;
    private List<Box> hold;

    public Ship() {
        this(generateLoadUnload(), generateCapacity());
    }

    public Ship(boolean load, int capacity) {
        this.load = load;
        hold = new ArrayList<>(capacity);
        maxCapacity = capacity;
        generateHold();
    }

    private void generateHold() {
        if (!this.load) {
            for (int i = 0; i < maxCapacity; i++) {
                hold.add(new Box());
            }
        }
    }

    private static int generateCapacity() {
        return new Random().nextInt(maxGenerateCapacity + 1);
    }

    private static boolean generateLoadUnload() {
        return new Random().nextBoolean();
    }

    public void loadBox(Box box) {
        if (hold.size() < maxCapacity) {
            hold.add(box);
        } else {
            throw new FullHoldException();
        }
    }

    public void unloadBox(Box box) {
        if (!hold.isEmpty()) {
            hold.remove(hold.size() - 1);
        } else {
            throw new EmptyHoldException();
        }
    }

}
