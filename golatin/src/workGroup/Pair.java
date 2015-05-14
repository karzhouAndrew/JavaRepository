package workGroup;
/**
 * Created by NotePad on 13.05.2015.
 */
public class Pair implements Comparable {
    private int number;
    private int value;

    public Pair(int number, int value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
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
        Pair tmp = (Pair) o;
        if (this.value == tmp.value) {
            return 0;
        }
        if (this.value > tmp.value) {
            return -1;
        }
        return 1;
    }
}
