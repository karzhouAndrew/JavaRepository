package task16;

import java.util.Scanner;

// Найти в строке не только запятые, но и другие знаки препинания.
// Подсчитать общее их количество.

public class Task16Test {
    public static void main(String[] args) {
        System.out.println("Введите текст.");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        System.out.println("Количество знаков препинания " + Task16.quantityOfPunctuation(text));
    }
}