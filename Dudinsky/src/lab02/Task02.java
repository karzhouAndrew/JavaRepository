package lab02;

/* Имеется промежуток времени в секундах. Следует вывести его на страницу в виде часов минут и секунд.
Задание 2 Продолжите приведенный пример, добавьте расчет и вывод суток и недель. */
public class Task02 {
    public static void main(String[] args) {
        int s = 1990960;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        System.out.print(s + " секунд(а/ы) - это: ");
        System.out.println(w + " недел(я/и/ь) " + day + " день/дн(я/ей) " + hour + " час(а/ов) " + min + " минут(а/ы) " + sec + " секунд(а/ы)");
    }
}
