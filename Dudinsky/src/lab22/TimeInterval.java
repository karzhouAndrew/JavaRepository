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
        return (this.hours * 60 + this.minutes) * 60 + this.seconds;
    }

    public int compareTo(TimeInterval anotherTimeInterval) {
        return this.getTotalSecondsValue() - anotherTimeInterval.getTotalSecondsValue();
    }

    public String getValueInHMSFormat() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }

    @Override
    public String toString() {
        return "{" + hours + "час(а/ов), " + minutes + " минут(а/ы), " + seconds + " секунд(а/ы)}";
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