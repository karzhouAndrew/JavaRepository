package lab23;

public enum MonetaryValue {
    VALUE20 (20),
    VALUE50 (50),
    VALUE100 (100);

    private final int value;

    MonetaryValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
