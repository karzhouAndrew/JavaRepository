package task29;

import java.util.Scanner;

public class TaskTest {
    public static void main(String[] args) {
        System.out.println("Введите текст.");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        System.out.println(Task29.getWordsFrequency(text));
    }
}
