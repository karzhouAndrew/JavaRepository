package lab2;

//Продолжите приведенный пример, добавьте расчет и вывод суток и недель.
public class AddDaysWeeks {
    public static void main(String[] args) {
        int s = 3756723;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int days = d % 7;
        int w = (d - days) / 7;
        System.out.println(w + " недель " + days + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");
    }
}

