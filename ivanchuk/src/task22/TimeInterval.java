package task22;


public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int secondsTime) {
        this.seconds = secondsTime % 60;
        int minutes = (secondsTime - this.seconds) / 60;
        this.minutes = minutes % 60;
        this.hours = (minutes - this.minutes) / 60;
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public int allSeconds() {
        int seconds = this.seconds;
        seconds += this.minutes * 60;
        seconds += this.hours * 3600;
        return seconds;
    }

    public int compareTo(TimeInterval anotherTimeInterval) {
        if (hours != anotherTimeInterval.hours) {
            return hours - anotherTimeInterval.hours;
        } else if (minutes != anotherTimeInterval.minutes) {
            return minutes - anotherTimeInterval.minutes;
        } else return seconds - anotherTimeInterval.seconds;
    }
}
