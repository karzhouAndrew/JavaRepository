package lab2;

/**
 * Created by USER on 02.05.2015.
 Продолжите приведенный пример, добавьте расчет и вывод суток и недель. */
public class task2 {
    public static void main(String[] args) {
        int s = 6057700; //общее к-во
        int sec = s % 60;//остаток сек
        int m = (s - sec) / 60;//общее минут
        int min = m % 60;// остаток мин
        int h = (m - min) / 60;//общее к-во часов
        int hour = h % 24;//остаток часов
        int d = (h - hour) / 24;//общее к-во дней
        int day = d % 7;//к-во дней
        int w = (d - day) / 7;

        System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}
