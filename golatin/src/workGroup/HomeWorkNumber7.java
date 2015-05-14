package workGroup;

/**
 * Created by User on 02.05.2015.
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?
 */
public class HomeWorkNumber7 {
    public static void main(String[] args) {
        int number = 1245785;
        String result = "Совпадений нет";
        for (int flags = 0; number > 0; number /= 10) {
            if ((flags & (1 << (number % 10))) != 0) {
                result = "Совпадение в цифре: " + number % 10;
                break;
            }
            flags |= 1 << (number % 10);
        }
        System.out.println(result);
    }
}
