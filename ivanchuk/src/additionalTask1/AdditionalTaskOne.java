package additionalTask1;

import java.util.Scanner;

// Определить сумму n первых цифр дробной части
// заданного положительного вещественного числа

public class AdditionalTaskOne {
    public static void main(String[] args) {
        System.out.println("Введите число n.");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        System.out.println("Введите положительное действительное число.");
        double number = in.nextDouble();
        in.close();
        number *= Math.pow(10, quantity);
        int result = 0;
        for (int j = 0; j < quantity; j++) {
            result += (int) (number % Math.pow(10, j + 1) / Math.pow(10, j));
        }
        System.out.println("Сумма " + quantity + " первых цифр дробной части равна " + result);
    }
}
