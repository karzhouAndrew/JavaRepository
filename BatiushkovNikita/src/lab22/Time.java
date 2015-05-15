package lab22;

public class Time {
    private int seconds;
    private int minutes = 10;
    private int hours;

    // Конструктор
    public Time(int seconds, int hours) {
        this.seconds = seconds;
        this.hours = hours;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
