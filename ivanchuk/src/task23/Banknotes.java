package task23;

public enum Banknotes {
    BANKNOTES_TWENTY(20, "banknotes twenty"), BANKNOTES_FIFTY(50, "banknotes fifty"), BANKNOTES_HUNDRED(100, "banknotes hundred");

    private int faceValue;
    private String stringValue;

    Banknotes(int faceValue, String stringValue) {
        this.faceValue = faceValue;
        this.stringValue = stringValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}