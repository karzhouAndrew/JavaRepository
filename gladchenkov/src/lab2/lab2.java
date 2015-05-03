package lab2;

/**Продолжите приведенный пример, добавьте расчет и вывод суток и недель */
public class lab2 {
    public static void main(String[] args) {
        int s = 654400;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int day = h % 24;
        int w = d % 7;
        int week = (d - w) / 7;
        System.out.println(week + " недель " + day + " дней  " + hours + " часов " + min + " минут " + sec + " секунд ");
    }
}