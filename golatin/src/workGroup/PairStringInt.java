package workGroup;
/**
 * Created by NotePad on 14.05.2015.
 */
public class PairStringInt implements Comparable {
    private int number;
    private String value;

    public PairStringInt(int number, String value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                +number +
                ", " + value +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        PairStringInt tmp = (PairStringInt) o;
        if (this.value.length() == tmp.value.length()) {
            return 0;
        }
        if (this.value.length() > tmp.value.length()) {
            return -1;
        }
        return 1;
    }
}
