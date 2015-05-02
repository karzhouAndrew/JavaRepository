package lab2;

/*Задание 2
  Вывыести сутки и  недели     */

public class DayWeek {
    public static void main(String[] args) {
        int s = 3700000;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int day = d % 7;
        int week = (d - day) / 7;

        System.out.println(week + " недель " + day + " дней " + hours + " часов " + min + " минут " + sec + " секунд");

    }
}
