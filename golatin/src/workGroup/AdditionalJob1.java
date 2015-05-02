package workGroup;

/**
 * Created by User on 02.05.2015.
 * Определить сумму n первых цифр дробной части заданного положительного вещественного числа.
 */
public class AdditionalJob1 {
    public static void main(String[] args) {
        float floatNumber = 34.345345f;
        System.out.println(floatNumber);
        int number = 4;
        int sum = 0;
        for (floatNumber -= (int) floatNumber; number > 0; floatNumber = 10 * floatNumber - (int) (10 * floatNumber), number--) {
            sum += (int) ((floatNumber - (int) floatNumber) * 10);
        }
        System.out.println(sum);

    }
}
