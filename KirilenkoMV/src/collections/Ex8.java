package collections;

import java.util.*;

/**
 * Created by asus on 08.06.2015.
 * Создать коллекцию, наполнить её случайными чслами. Удалить повторяющиеся числа.
 */
public class Ex8 {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<Integer>();
        Set<Integer> uniqDigits = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            digits.add((int) (Math.random() * 20));
            System.out.print(digits.get(i) + " ");
        }
        System.out.println();
        uniqDigits.addAll(digits);

        for (Integer digit : uniqDigits) {
            System.out.print(digit + " ");
        }

    }
}
