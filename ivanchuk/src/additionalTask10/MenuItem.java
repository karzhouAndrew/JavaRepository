package additionalTask10;

import java.util.Scanner;

public abstract class MenuItem {
    private final String NAME_ITEM;

    public MenuItem(String nameItem) {
        NAME_ITEM = nameItem;
    }

    public String getNameItem() {
        return NAME_ITEM;
    }

    public abstract void run(Scanner scanner, AutoHouse autoHouse);
}
