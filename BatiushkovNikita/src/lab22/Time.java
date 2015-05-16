package lab22;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds % 60;
        this.minutes = (seconds / 60 + minutes) % 60;
        this.hours = seconds / 3600 + minutes / 60 + hours;
    }

    public Time(int seconds) {
        this.seconds = seconds % 60;
        int minutes = (seconds - this.seconds) / 60;
        this.minutes = ((seconds - this.seconds) / 60) % 60;
        this.hours = ((minutes - this.minutes) / 60);
    }

    public int getAmountSeconds() {
        return this.seconds + this.minutes * 60 + this.hours * 3600;
    }

    public boolean compareTimeObjects(Time anotherTime) {
        return getAmountSeconds() == anotherTime.getAmountSeconds();
    }

    @Override
    public String toString() {
        return "Time{" +
                "seconds = " + seconds +
                ", minutes = " + minutes +
                ", hours = " + hours +
                '}' + "\n" + "Total time in seconds = " + getAmountSeconds();
    }
}
