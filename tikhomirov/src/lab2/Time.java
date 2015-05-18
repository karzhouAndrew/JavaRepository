package lab2;

/**
 * Имеется промежуток времени в сеундах. Вывести его на страницу в виде недель, суток, часов, минут и секунд.
 */
public class Time {
    public static void main(String[] args) {
        int s = 115008;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 24;
        int week = (d - day) / 7;
        System.out.println("Время: " + week + " недель  " + day + " дней   " + hour + " часов " + min + " минут " + sec + " секунд ");
    }
}
