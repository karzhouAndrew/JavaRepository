package add1;

/**
 * 1.	Определить сумму n первых цифр дробной части заданного положительного вещественного числа.
 */
public class Add1 {
    public static void main(String[] args) {
        double number = 35.46;
        int numberInt = (int) number;
        number = number - numberInt;
        int sum = 0;
        while (true) {
            number = number * 10;
            numberInt = (int) number;
            number = number - numberInt;
            if (numberInt != 0) {
                sum += numberInt;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}

