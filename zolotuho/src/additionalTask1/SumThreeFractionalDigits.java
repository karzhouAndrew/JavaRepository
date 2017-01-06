package additionalTask1;

import java.util.Scanner;

//	Определить сумму первых трех цифр дробной части заданного положительного вещественного числа
public class SumThreeFractionalDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real number: ");
        float number = 0;
        if (sc.hasNextFloat()) {
            number = sc.nextFloat();
        }
        sc.close();
        int fractDigit;
        int sum = 0;
        int integralPart;
        for (int i = 0; i < 3; i++) {
            number *= 10;
            integralPart = (int) number;
            fractDigit = integralPart % 10;
            sum += fractDigit;
        }
        System.out.println("Sum = " + sum);
    }
}
