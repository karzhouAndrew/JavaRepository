package additionalTask4;

import java.util.Scanner;

//найти счастливые числа
public class HappyNumbersChecker {

    public static boolean isHappyNumber(int number) {
        boolean isLuckyNumber = true;
        while (number / 10 > 0) {
            boolean isEqualNeighbourDigit = number % 10 == number / 10 % 10;
            boolean isGrowDigitByOne = number % 10 - 1 == number / 10 % 10;
            if (isEqualNeighbourDigit || isGrowDigitByOne) {
                number /= 10;
            } else {
                isLuckyNumber = false;
                break;
            }
        }
        return isLuckyNumber;
    }

    public static boolean isMagicNumber(int number) {
        return number == 781 || number == 302 || number == 409 || number == 941;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three-digit number : ");
        int number = sc.nextInt();
        sc.close();
        if (isHappyNumber(number)) {
            System.out.println("happy number");
        } else if (isMagicNumber(number)) {
            System.out.println("magic number");
        } else {
            System.out.println("ordinary number");
        }
    }
}
