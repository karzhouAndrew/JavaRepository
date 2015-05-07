package lab6;

/**
 * Задание 6
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 * работает с числом знаков до 6, но можно и больше. Смысл ясен
 */
public class Lab6 {
    public static void main(String[] args) {
        int number = 516;
        int num12;
        int num13;
        int num14;
        int num15;
        int num16;
        int num17;
        int num1 = number % 10;
        int num11 = (number - number % 10) / 10;
        if (num11 > 0) {
            num11 = num11 % 10;
            num12 = (number - number % 100) / 100;
            if (num12 > 0) {
                num12 = num12 % 10;
                num13 = (number - number % 1000) / 1000;
                if (num13 > 0) {
                    num13 = num13 % 10;
                    num14 = (number - number % 10000) / 10000;
                    if (num14 > 0) {
                        num14 = num14 % 10;
                        num15 = (number - number % 100000) / 100000;
                        if (num15 > 0) {
                            num15 = num15 % 10;
                            num16 = (number - number % 1000000) / 1000000;
                            if (num16 > 0) {
                                num16 = num16 % 10;
                                num17 = (number - number % 10000000) / 10000000;
                            } else {
                                num15 = num1 * 100000 + num11 * 10000 + num12 * 1000 + num13 * 100 + num14 * 10 + num15;
                                System.out.println(num15);
                            }
                        } else {
                            num14 = num1 * 10000 + num11 * 1000 + num12 * 100 + num13 * 10 + num14;
                            System.out.println(num14);
                        }
                    } else {
                        num13 = num1 * 1000 + num11 * 100 + num12 * 10 + num13;
                        System.out.println(num13);
                    }
                } else {
                    num12 = num1 * 100 + num11 * 10 + num12;
                    System.out.println(num12);
                }
            } else {
                num11 = num1 * 10 + num11;
                System.out.println(num11);
            }
        } else {
            System.out.println(num1);
        }
    }
}
