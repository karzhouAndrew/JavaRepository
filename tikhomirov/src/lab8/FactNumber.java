package lab8;

/**
 * Найти факториал случайного числа .
 */
public class FactNumber {
    public static void main(String[] args) {
        int factNum = 1;
        int n = 1;
        int number = (int) (Math.random() * 10);
        if (number != 0) {
            while (n <= number) {
                factNum *= n;
                n++;
            }
            System.out.println("Факториал случайного числа " + number + " равен " + factNum);
        } else {
            System.out.println("Факториал нуля равен нулю");
        }
    }
}
