/**
 * Дано    любое  натуральное    n.
 * Верно  ли,  что  все    цифры  числа
 * различны?
 */
public class DifferentDigit {
    public static void main(String[] args) {
        int arrValue[] = new int[25];
        int value = 11;
        int kolCifr = 0;
        int flag = 0;
        for (int i = 10, val = value; val > 0; i = i * 10) {
            val = val - i;
            kolCifr++;
        }
        int counter = 0;
        for (int val = value, ost, i = 10; kolCifr != 0; kolCifr--, i = i * 10, counter++) {
            ost = (val % i) / (i / 10);
            val = val - ost;
            arrValue[counter] = ost;
        }
        for (int i = 0; i < counter; i++) {
            for (int k = i + 1; k < counter; k++) {
                if (arrValue[i] == arrValue[k]) {

                    flag++;
                }
            }
        }
        if (flag != 0) {
            System.out.println("не все цифры числа различны");
        } else {
            System.out.println("все цифры числа различны");
        }
    }
}