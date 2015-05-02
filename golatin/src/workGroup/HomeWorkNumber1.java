package workGroup;

/**
 * Created by User on 02.05.2015.
 * Продолжите приведенный пример, добавьте расчет и вывод суток и недель.
 */
public class HomeWorkNumber1 {
    public static void main(String[] args) {
        int s = 3600145;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}
