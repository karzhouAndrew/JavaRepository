package lab2;
//task 2
public class HellowWorld {
    public static void main(String[] args) {
        int s = 5566600;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h % 24;
        int day = (h - d) / 24;
        int w = day % 7;
        int week = (day - w) / 7;
        System.out.println(week + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд");
    }
}
