package additionalTask4;

// На вход программе поступает трёхзначное число (от 100 до 999),
// которое генерируется случайным образом либо вводиться из консоли (на свое усмотрение).
// Необходимо определить является ли число счастливым.
// Счастливое число, это число у которого все цифры совпадают (например 777),
// либо число у которого каждая последующая цифра на 1 больше предыдущей (123 или 456),
// а также счастливыми являются числа 781, 302, 409 и 941 (такие числа будет называть “Магическими”).
// Программа должна вывести на экран входное число ( только в случае если оно было сгенерировано) и
// результат какое число попалось: “Счастливое”, “Несчастливое” или “Магическое”.

public class AdditionalTaskFour {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 641 + 300);
        switch (number) {
            case 302:
            case 409:
            case 781:
            case 941:
                System.out.println("Число " + number + " - \"Магическое\".");
                break;
            default:
                int[] array = new int[3];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (number % Math.pow(10, i + 1) / Math.pow(10, i));
                }
                boolean coincidence = array[0] == array[1] && array[0] == array[2];
                boolean increase = array[2] == array[1] - 1 && array[1] == array[0] - 1;
                if (coincidence || increase) {
                    System.out.println("Число " + number + " - \"Счастливое\".");
                } else {
                    System.out.println("Число " + number + " - \"Несчастливое\".");
                }
        }
    }
}