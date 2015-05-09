package Lab6;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class Lab6 {
    public static void main(String[] args) {
        int number = 13353323;
        int mirrorA = 0;

        while (number != 0) {
            mirrorA = mirrorA * 10 + (number % 10);
            number = number / 10;
        }
        System.out.println(mirrorA);
    }
}
