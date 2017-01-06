package module2.SeaPort.ship;


import module2.SeaPort.box.Box;
import module2.SeaPort.ship.exception.EmptyHoldException;
import module2.SeaPort.ship.exception.FullHoldException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private boolean isLoad;
    private int maxCapacity;
    private final static int maxGenerateCapacity = 10;
    private List<Box> hold;

    public Ship() {
        this(generateLoadUnload(), generateCapacity());
    }

    public Ship(boolean isLoad, int capacity) {
        this.isLoad = isLoad;
        hold = new ArrayList<>(capacity);
        maxCapacity = capacity;
        generateHold();
    }

    private void generateHold() {
        if (!isLoad) {
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

    public Box unloadBox() {
        if (!hold.isEmpty()) {
            Box box = hold.get(hold.size() - 1);
            hold.remove(hold.size() - 1);
            return box;
        } else {
            throw new EmptyHoldException();
        }
    }

    public boolean isLoad() {
        return isLoad;
    }

    public boolean isEmpty() {
        return hold.isEmpty();
    }

}
