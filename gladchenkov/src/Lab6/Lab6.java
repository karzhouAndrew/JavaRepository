package Lab6;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class Lab6 {
    public static void main(String[] args) {
        int a = 13353323;
        int mirrorA = 0;

        while (a != 0) {
            mirrorA = mirrorA * 10 + (a % 10);
            a = a / 10;
        }
        System.out.println(mirrorA);
    }
}
