package lab7;

/**
 * Дано любое натуральное число n. Верно ли, что все цифры числа различны?
 */
public class EqualNum {
    public static void main(String[] args) {
        int number = 15908;
        int lengthNumber = 1;
        while (number / 10 >= 1) {
            lengthNumber += 1;
            number /= 10;
        }
        boolean p = false;
        int array[] = new int[lengthNumber];
        for (int i = 0; i < lengthNumber; i++) {
            int a = number % 10;
            array[i] = a;
            number /= 10;
        }
        for (int i = 0; i < lengthNumber; i++) {
            for (int j = i + 1; j < lengthNumber; j++) {
                if (array[i] == array[j]) {
                    p = true;
                    break;
                }
            }
        }
        if (p) {
            System.out.println("В этом числе есть одинаковые цифры ");
        } else {
            System.out.println("В этом числе нет одинаковых цифр ");
        }
    }
}
