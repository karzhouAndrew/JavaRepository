package additionalTask10;

import java.util.Scanner;

public abstract class MenuItem {
    private final String ITEM_NAME;

    public MenuItem(String nameItem) {
        ITEM_NAME = nameItem;
    }

    public String getNameItem() {
        return ITEM_NAME;
    }

    public abstract void run(Scanner scanner, AutoHouse autoHouse);
}
