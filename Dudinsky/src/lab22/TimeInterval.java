package lab22;

public class TimeInterval {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeInterval(int hours, int minutes, int seconds) {
        this.seconds = seconds % 60;
        int minutesValue = (seconds - this.seconds) / 60 + minutes;
        this.minutes = minutesValue % 60;
        this.hours = (minutesValue - this.minutes) / 60 + hours;
    }

    public TimeInterval(int seconds) {
        this(0, 0, seconds);
    }

    public int getTotalSecondsValue() {
        return (hours * 60 + minutes) * 60 + seconds;
    }

    public int compareTo(TimeInterval anotherTimeInterval) {
        return getTotalSecondsValue() - anotherTimeInterval.getTotalSecondsValue();
    }

    public String getValueInHMSFormat() {
        return hours + ":" + minutes + ":" + seconds;
    }

    @Override
    public String toString() {
        return "{" + hours + " час(а/ов), " + minutes + " минут(а/ы), " + seconds + " секунд(а/ы)}";
    }

    public int getSeconds() {
        return seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}