package task21;

import java.util.Scanner;

//Написать программу, выполняющую поиск в строке всех тегов абзацев,
//в т.ч. тех, у которых есть параметры, например <p id=”p1”>,
// и замену их на простые теги абзацев <p>.

public class Task21Test {
    public static void main(String[] args) {
        System.out.println("Введите html код");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        System.out.println(Task21.simpleParagraph(text));
    }
}