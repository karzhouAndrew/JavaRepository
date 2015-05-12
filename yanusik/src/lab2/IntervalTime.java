package lab2;

//task 2
public class IntervalTime {
    public static void main(String[] args) {
        int s = 604799;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = m % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int week = (d - day) / 7;
        System.out.printf(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");

    }
}
