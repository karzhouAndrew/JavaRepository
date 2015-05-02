package laba7;

//There is natural number. Is it all literals different?
public class DifferentNumerals {
    public static void main(String[] args) {
        int number = 1234584;
        int numberChange = number;
        boolean flag = false;
        while (numberChange > 10) {
            int numeralLast = numberChange % 10;
            int numberRemainder = numberChange / 10;
            while (numberRemainder != 0) {
                if (numeralLast == (numberRemainder % 10)) {
                    flag = true;
                    break;
                }
                numberRemainder /= 10;
            }
            numberChange /= 10;
            if (flag) {
                System.out.println("Число " + number + " содержит одинаковые цифры");
                break;
            } else if (numberChange < 10) {
                System.out.println("Число " + number + " не содержит одинаковых цифр");
                break;
            }
        }
    }
}
