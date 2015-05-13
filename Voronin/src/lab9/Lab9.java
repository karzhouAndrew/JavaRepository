package lab9;

import static java.lang.Math.random;

//имеется последовательность случайных чисел, найти и вывести наибольшее из них
public class Lab9 {
    public static void main(String[] args) {
        int number = (int) (random() * 20);
        int number2 = (int) (random() * 20);
        int res = 0;
        while (number != 0) {
            if (number > number2) {
                res = number;
            }
            number = (int) (random() * 20);
            number2 = (int) (random() * 20);
        }
        System.out.println("Наибольшее число " + res);
    }
}