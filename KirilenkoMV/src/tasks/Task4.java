package tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kirilenko_MV on 29.04.2015.
 * 4.	На вход программе поступает трёхзначное число (от 100 до 999), которое генерируется случайным образом либо вводиться из консоли (на своё усмотрение). Необходимо определить является ли число счастливым.
 * Счастливое число, это число у которого все цифры совпадают (например 777), либо число у которого каждая последующая цифра на 1 больше предыдущей (123 или 456), а также счастливыми являются числа 781, 302, 409 и 941 (такие числа будет называть “Магическими”).
 * Программа должна вывести на экран входное число ( только в случае если оно было сгенерировано) и результат какое число попалось: “Счастливое”, “Несчастливое” или “Магическое”.
 */
public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(899) + 100;
        //number = 456;
        int digit = number;
        System.out.print("number = " + number);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = digit % 10;
            digit /= 10;
        }

        if ((array[0] == array[1] && array[0] == array[2]) || (array[0] == array[1] + 1 && array[1] == array[2] + 1)) {
            System.out.println(" - счастливое");
        } else if (number == 781 || number == 302 || number == 409 || number == 941) {
            System.out.println(" - магическое");
        } else {
            System.out.println(" - несчастливое");
        }

    }
}
