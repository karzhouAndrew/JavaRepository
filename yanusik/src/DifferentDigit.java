/**
 * Дано    любое  натуральное    n.
 * Верно  ли,  что  все    цифры  числа
 * различны?
 */
public class DifferentDigit {
    public static void main(String[] args) {
        int arrValue[] = new int[25];
        int value = 11;
        int valueDigit = 0;
        boolean flag = false;
        for (int i = 10, j = value; j > 0; i = i * 10) {
            j = j - i;
            valueDigit++;
        }
        int counter = 0;
        for (int j = value, ost, i = 10; kolCifr != 0; kolCifr--, i = i * 10, counter++) {
            ost = (j % i) / (i / 10);
            j = j - ost;
            arrValue[counter] = ost;
        }
        for (int i = 0; i < counter; i++) {
            for (int k = i + 1; k < counter; k++) {
                if (arrValue[i] == arrValue[k]) {

                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("не все цифры числа различны");
        } else {
            System.out.println("все цифры числа различны");
        }
    }
}
