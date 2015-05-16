package lab9;

import static java.lang.Math.random;
import static java.lang.Math.max;

//имеется последовательность случайных чисел, найти и вывести наибольшее из них
public class Lab9 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (random() * 20);
        }
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = max(maxNumber, numbers[i]);
            }
        }
        System.out.println("Наибольшее число " + maxNumber);
    }
}