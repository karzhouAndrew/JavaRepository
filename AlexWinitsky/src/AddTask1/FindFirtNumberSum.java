package AddTask1;

/**
 * 1.	Определить сумму n первых цифр дробной части заданного положительного вещественного числа.
 */
public class FindFirtNumberSum {
    public static void main(String[] args) {
        double number = 25.89634;
        double tempNumber = number;
        int n = 3;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            tempNumber *= 10;
        }

        int intnumber = (int) tempNumber;

        for (int i = 0; i < n; i++) {
            sum = sum + intnumber % 10;
            intnumber = intnumber / 10;
        }
        System.out.println("Cумма " + n + " первых цифр дробной части числа " + number + " = " + sum);
    }
}