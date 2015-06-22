package extraLab10;

public enum Menu {
    ADD_NEW_CAR(1),
    REMOVE_CAR(2),
    SEARCH_CARS_BY_BRAND(3),
    SEARCH_CARS_BY_YEAR(4),
    SORT_CARS_BY_YEAR(5),
    SORT_CARS_BY_PRICE(6),
    VIEW_ALL_CARS(7),
    EXIT(8),
    DEFAULT,;

    private int value;

    private Menu(int value) {
        this.value = value;
    }

    private Menu() {

    }

    private int getValue() {
        return value;
    }

    public static Menu getIndex(int userInput) {
        for (Menu value : Menu.values()) {
            if (value.getValue() == userInput) {
                return value;
            }
        }
        return Menu.DEFAULT;
    }
}

