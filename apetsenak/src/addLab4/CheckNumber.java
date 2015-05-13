package addLab4;

public class CheckNumber {
    public static boolean isLucky(int number) {
        return isLuckySameness(number) || isLuckyIncrement(number);
    }

    public static boolean isLuckySameness(int number) {
        boolean isLuckyNumber = true;
        while (number / 10 > 0) {
            if (number % 10 == number / 10 % 10) {
                number /= 10;
            } else {
                isLuckyNumber = false;
                break;
            }
        }
        return isLuckyNumber;
    }

    public static boolean isLuckyIncrement(int number) {
        boolean isLuckyNumber = true;
        while (number / 10 > 0) {
            if (number % 10 == number / 10 % 10 + 1) {
                number /= 10;
            } else {
                isLuckyNumber = false;
                break;
            }
        }
        return isLuckyNumber;
    }

    public static boolean isMagic(int number) {
        return number == 781 || number == 302 || number == 409 || number == 941;
    }
}
