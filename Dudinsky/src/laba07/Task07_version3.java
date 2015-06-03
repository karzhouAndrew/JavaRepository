package laba07;

/*Дано любое натуральное n. Верно ли, что все цифры числа различны?*/
public class Task07_version3 {
    public static void main(String[] args) {
        int givenNumberN = 123450789;
        boolean equalDigits = false;
        System.out.print("В заданном числе n = " + givenNumberN);
        while (givenNumberN > 9) {
            int currentDigit = givenNumberN % 10;
            givenNumberN /= 10;
            int givNumFragment = givenNumberN;
            while (givNumFragment > 0) {
                if (givNumFragment % 10 == currentDigit) {
                    System.out.println(" обнаружен повтор цифры " + currentDigit);
                    equalDigits = true;
                    break;
                }
                givNumFragment /= 10;
            }
        }
        if (!equalDigits) {
            System.out.println(" все цифры различны");
        }
    }
}