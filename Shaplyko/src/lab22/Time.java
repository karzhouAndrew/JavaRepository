package lab22;

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
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public int amountSecond() {
        return (hour * 60 * 60 + minute * 60 + second);
    }

    public int amountSecond(Object object) {
        Time tmp = (Time) object;
        return (tmp.hour * 60 * 60 + tmp.minute * 60 + tmp.second);
    }


    public int compareToTime(Object object) {
        Time tmp = (Time) object;
        if ((amountSecond()) < (amountSecond(tmp))) {
            System.out.println("Объекты 1 меньше объекта 2 = " + -1);
            return -1;
        } else if ((amountSecond()) > (amountSecond(tmp))) {
            System.out.println("Объекты 1 больше объекта 2 = " + 1);
            return 1;
        }
        System.out.println("Объекты равны = " + 0);
        return 0;
    }
}



