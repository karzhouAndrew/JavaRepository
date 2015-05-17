package lab22;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int seconds) {
        //this.seconds=seconds;
        this(seconds / 3600, seconds / 60 % 60, seconds % 60);
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
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

    public int totalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public boolean compareTo(Time anotherObj) {
        return seconds == anotherObj.seconds && minutes == anotherObj.minutes && hours == anotherObj.hours;
    }

    @Override
    public String toString() {
        return "Время - " + String.format("%02d:%02d:%02d.", hours, minutes, seconds);
    }
}
