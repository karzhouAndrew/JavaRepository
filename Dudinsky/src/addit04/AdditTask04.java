package addit04;

import java.util.Scanner;

/* На вход программе поступает трёхзначное число (от 100 до 999), которое генерируется случайным образом либо вводиться из консоли (на своё усмотрение). Необходимо определить является ли число счастливым.
Счастливое число, это число у которого все цифры совпадают (например 777), либо число у которого каждая последующая цифра на 1 больше предыдущей (123 или 456), а также счастливыми являются числа 781, 302, 409 и 941 (такие числа будет называть “Магическими”).
Программа должна вывести на экран входное число ( только в случае если оно было сгенерировано) и результат какое число попалось: “Счастливое”, “Несчастливое” или “Магическое”.  */
public class AdditTask04 {
    public static void main(String[] args) {
        System.out.print("Введите целое трехзначное число: ");
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        scan.close();
        if (99 < givenNumber && givenNumber < 1000) {
            int digit1 = givenNumber / 100;
            int digit2 = (givenNumber / 10) % 10;
            int digit3 = givenNumber % 10;
            if ((digit1 == digit2 && digit2 == digit3) || (digit3 - digit2 == 1 && digit2 - digit1 == 1)) {
                System.out.println("\"Счастливое\" число");
            } else if (givenNumber == 781 || givenNumber == 302 || givenNumber == 409 || givenNumber == 941) {
                System.out.println("\"Магическое\" число");
            } else {
                System.out.println("\"Несчастливое\" число");
            }
        } else {
            System.out.println("Введенное число не трехзначное");
        }
    }
}