package lab22;

/**
 * Created by PC on 17.05.2015.
 */
public class Period {
    private int seconds;
    private int hours;
    private int minutes;

    public Period() {
    }

    public Period(int seconds) {
        this.seconds = seconds;
    }

    public Period(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int sumOfHoursMinutesSeconds() {
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }

    public String compareOfTime(Period secondPeriod) {
        String result = null;
        if ((hours * 60 * 60) + (minutes * 60) + seconds > secondPeriod.hours * 60 * 60 + secondPeriod.minutes * 60 + secondPeriod.seconds) {
            return result = "первый промежуток больше второго";
        } else if ((hours * 60 * 60) + (minutes * 60) + seconds == secondPeriod.hours * 60 * 60 + secondPeriod.minutes * 60 + secondPeriod.seconds) {
            System.out.println("равны");
            return result = "равны";
        } else {
            return result = "первый промежуток меньше второго";
        }
    }
}
