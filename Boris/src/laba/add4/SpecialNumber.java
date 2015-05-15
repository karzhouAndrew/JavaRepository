package laba.add4;

//4.На вход программе поступает трёхзначное число (от 100 до 999), которое генерируется случайным образом либо
// вводиться из консоли (на своё усмотрение). Необходимо определить является ли число счастливым.
// Счастливое число, это число у которого все цифры совпадают (например 777), либо число у которого каждая
// последующая цифра на 1 больше предыдущей (123 или 456), а также счастливыми являются числа 781, 302, 409 и 941
// (такие числа будет называть “Магическими”).
// Программа должна вывести на экран входное число ( только в случае если оно было сгенерировано) и результат
// какое число попалось: “Счастливое”, “Несчастливое” или “Магическое”.

public class SpecialNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 900 + 100);
        int firstNumber = number % 10;
        int secondNumber = (number - firstNumber) / 10 % 10;
        int thirdNumber = (number - firstNumber - secondNumber) / 100;
        if ((number % 111 == 0) || ((secondNumber - firstNumber == 1) && (thirdNumber - secondNumber == 1))) {
            System.out.println("Число " + number + " счастливое");
        } else if ((number == 781) || (number == 302) || (number == 409) || (number == 941)) {
            System.out.println("Число " + number + " магическое");
        } else {
            System.out.println("Число " + number + " несчастливое");
        }
    }
}
