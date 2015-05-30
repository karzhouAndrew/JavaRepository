package add1;

/**
 * 1.	Определить сумму n первых цифр дробной части заданного положительного вещественного числа.
 */
public class Add1 {
    public static void main(String[] args) {
        double number = 35.46;
        int n = 1;
        number = number - (int) number;
        int sum = 0;
        while (n > 0) {
            number *= 10;
            sum += (int) number;
            number -= (int) number;
            n--;
        }
        System.out.println(sum);
    }
}

