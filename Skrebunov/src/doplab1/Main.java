package doplab1;

/*1.	Определить сумму первых трех цифр дробной части заданного положительного вещественного числа
 */
public class Main {
    public static void main(String[] args) {
        double number = 0.147;
        double percent = number * 1000;
        System.out.println(percent);
        int sum = 0;
        if (percent % 10000 == percent) {
            sum = (int) ((percent % 10) + ((percent % 100) / 10) + ((percent % 1000) / 100));
            System.out.println(sum);
        } else if (percent % 1000 == percent) {
            sum = (int) ((percent % 10) + ((percent % 100) / 10) + ((percent % 1000) / 100));
            System.out.println(sum);
        } else if (percent % 100 == percent) {
            sum = (int) ((percent % 10) + ((percent % 100) / 10));
            System.out.println(sum);
        } else if (percent % 10 == percent) {
            sum = (int) (percent % 10);
            System.out.println(sum);
        }
    }
}
