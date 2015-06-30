package task5;

import java.util.Scanner;

//Имеется целое число (любое), это число — сумма денег в рублях.
// Вывести это число, добавив к нему слово «рублей» в правильном падеже.
public class WritingRubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rubles do you want to enter: ");
        int rub = 0;
        if (sc.hasNext()) {
            rub = sc.nextInt();
        }
        sc.close();
        int residue;
        int digitCounter=0;
        int lastDigit = rub % 10;
        int beforeLastDigit = (rub - lastDigit) / 10 % 10;
        boolean isLastDigits056789 = lastDigit == 0 || lastDigit == 5 || lastDigit == 6 || lastDigit == 7 || lastDigit == 8 || lastDigit == 9;
        boolean isLastDigits345 = lastDigit == 2 || lastDigit == 3 || lastDigit == 4;
        while (rub > 0) {
            residue = rub % 10;
            rub = (rub - residue) / 10;
            digitCounter++;
        }
        if ((beforeLastDigit == 1) && (digitCounter >= 2)) {
            System.out.println(" рублей");
        } else if (isLastDigits056789 == true) {
            System.out.println(" рублей");
        } else if (isLastDigits345 == true) {
            System.out.println(" рубля");
        } else if (lastDigit == 1) {
            System.out.println(" рубль");
        }
    }
}
