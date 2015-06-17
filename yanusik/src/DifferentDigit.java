package lab7;

/**
 * Дано    любое  натуральное    n.
 * Верно  ли,  что  все    цифры  числа
 * различны?
 */
public class DifferentDigit {
    public static void main(String[] args) {
        int arrValue[] = new int[25];
        int number = 11;
        int numberDigit = 0;
        boolean differNumb = false;
        for (int i = 10, j = number; j > 0; i = i * 10) {
            j -= i;
            numberDigit++;
        }
        int counter = 0;
        for (int j = number, ost, i = 10; numberDigit != 0; numberDigit--, i = i * 10, counter++) {
            ost = (j % i) / (i / 10);
            j -= ost;
            arrValue[counter] = ost;
        }
        for (int i = 0; i < counter; i++) {
            for (int k = i + 1; k < counter; k++) {
                if (arrValue[i] == arrValue[k]) {
                    differNumb = true;
                }
            }
        }
        if (differNumb) {
            System.out.println("не все цифры числа различны");
        } else {
            System.out.println("все цифры числа различны");
        }
    }
}
