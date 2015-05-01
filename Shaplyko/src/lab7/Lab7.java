package lab7;

/**
 * Задание 7
 Дано  любое натуральное  n. Верно ли, что все  цифры числа раз-личны?
Для шестизначного числа
 */
public class Lab7 {
    public static void main(String[] args) {
        int number = 133456;
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
                                if (num11 == num1 || num11 == num12 || num11 == num13 || num11 == num14 || num11 == num15 || num12 == num1 || num12 == num13 || num12 == num14 || num12 == num15 || num13 == num14 || num13 == num15 || num13 == num1 || num1 == num14 || num14 == num15 || num1 == num15){
                                    System.out.println( "Да, совпадение");
                                } else {
                                    System.out.println( "Нет, они различны");
                                }
                            }
                        } else {
                            if (num11 == num1 || num11 == num12 || num11 == num13 || num11 == num14 || num12 == num1 || num12 == num13 || num12 == num14 || num13 == num14 || num1 == num14 || num1 == num13 ) {
                                System.out.println( "Да, совпадение");
                            } else {
                                System.out.println( "Нет, они различны");
                            }
                        }
                    } else {
                        if (num11 == num1 || num11 == num12 || num11 == num13 || num12 == num1 || num12 == num13 || num1 == num13) {
                            System.out.println( "Да, совпадение");
                        } else {
                            System.out.println( "Нет, они различны");
                        }
                    }
                } else {
                    if (num11 == num1 || num11 == num12 || num12 == num1 ) {
                        System.out.println( "Да, совпадение");
                    } else {
                        System.out.println( "Нет, они различны");
                    }
                }
            } else {
                if (num11 == num1) {
                    System.out.println( "Да, совпадение");
                } else {
                    System.out.println( "Нет, они различны");
                }
            }
        } else {
            System.out.println( "У нас только одно число " +  num1);
        }
    }
}
