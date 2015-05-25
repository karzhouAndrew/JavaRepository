package extraLab10;


public enum MainMenu {
    ADD_CAR(1),
    REMOVE_CAR(2),
    SEARCH_BY_BRAND(3),
    SEARCH_BY_YEAR(4),
    SORT_BY_YEAR(5),
    SORT_BY_PRICE(6),
    VIEW_ALL(7);

    private int value;

    MainMenu(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
