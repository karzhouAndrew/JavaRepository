package lab36;

import java.util.Scanner;

/**
 * Задание 3
 * Создать простейший логгер, выводящий сообщения об ошибках в тестовый файл. Объект логгера должен быть создан с помощью ШП Singleton. У объекта должен быть обязательным один метод, получающий на вход текст сообщения об ошибке и записывающий его в файл вместе с информацией о дате и времени проишествия.
 */
public class RunDivisionNumber {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число - делимое");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число - делитель");
        int secondNumber = scanner.nextInt();
        scanner.close();
        DivisionNumber division = new DivisionNumber();
        System.out.println("Результат деление " + firstNumber + "/" + secondNumber + "=" + division.division(firstNumber, secondNumber));
    }
}
