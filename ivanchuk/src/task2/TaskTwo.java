package task2;

import java.util.Scanner;

//Имеется промежуток времени в секундах.
//Следует вывести его на страницу в виде недель, суток, часов, минут и секунд.
public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int number = in.nextInt();
        in.close();
        int seconds = number % 60;
        int min = (number - seconds) / 60;
        int minutes = min % 60;
        int hour = (min - minutes) / 60;
        int hours = hour % 24;
        int day = (hour - hours) / 24;
        int days = day % 7;
        int weeks = (day - days) / 7;
        System.out.println(weeks + " недель " + days + " суток " + hours + " часов " + minutes + " минут " + seconds + " секунд.");
    }
}
