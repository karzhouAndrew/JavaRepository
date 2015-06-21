package task23;

public enum Banknotes {
    BANKNOTES_TWENTY(20, "banknotes twenty"), BANKNOTES_FIFTY(50, "banknotes fifty"), BANKNOTES_HUNDRED(100, "banknotes hundred");

    private final int FACE_VALUE;
    private final String STRING_VALUE;

    Banknotes(int faceValue, String stringValue) {
        FACE_VALUE = faceValue;
        STRING_VALUE = stringValue;
    }

    public int getFaceValue() {
        return FACE_VALUE;
    }

    public String getStringValue() {
        return STRING_VALUE;
    }
}