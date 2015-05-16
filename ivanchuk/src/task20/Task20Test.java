package task20;

import java.util.Scanner;

//Написать программу, выполняющую поиск в строке
// шестнадцатеричных чисел, записаных по правилам Java,
// с помощью регулярных выражений и вывести их на страницу.

public class Task20Test {
    public static void main(String[] args) {
        System.out.println("Введите текст.");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        System.out.println(Task20.searchOfHexadecimalNumbers(text));
    }
}

