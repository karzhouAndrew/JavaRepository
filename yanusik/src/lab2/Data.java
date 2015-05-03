package lab2;

/*Имеется промежуток времени в секундах.
Следует вывести его на страницу в виде часов минут и секунд.
Продолжите приведенный пример, добавьте расчет и вывод суток и недель
 */
public class Data {
    public static void main(String[] args) {
        int array[];
        String[] arr = {"секунд", "минут", "часов", "дней", "недель"};
        array = new int[6];
        int s = 360134567;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int week = (d - day) / 7;
        array[0] = sec;
        array[1] = min;
        array[2] = hour;
        array[3] = day;
        array[4] = week;
        for (int i = 0; i < 5; i++) {
            if (array[i] != 0) {
                System.out.printf(array[i] + " " + arr[i] + " ");
            }
        }
    }
}
