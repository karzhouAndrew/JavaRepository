package lab22;

/**
 * Created by Константин on 14.05.2015.
 */
public class Time {
    private int second;
    private int minute;
    private int hour;

    public Time(int second) {
        this.second = second;
    }

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getSecond() {
        System.out.println("Количество секунд = " + second);
        return second;
    }

    public int getMinute() {
        System.out.println("Количество минут = " + minute);
        return minute;
    }

    public int getHour() {
        System.out.println("Количество часов = " + hour);
        return hour;
    }

    public int amountSecond() {
        return (hour * 60 * 60 + minute * 60 + second);
    }

    public int compareToTime(Object object) {
        Time tmp = (Time)  object;
        if ((this.second + this.minute * 60 + this.hour * 60 * 60) < (tmp.second + tmp.minute * 60 + tmp.hour * 60 * 60)) {
            System.out.println("Объекты 1 меньше объекта 2 = " + -1);
            return -1;
        } else if ((this.second + this.minute * 60 + this.hour * 60 * 60) > (tmp.second + tmp.minute * 60 + tmp.hour * 60 * 60)) {
            System.out.println("Объекты 1 больше объекта 2 = " + 1);
            return 1;
        }
        System.out.println("Объекты равны = " + 0);
        return 0;
    }
}


