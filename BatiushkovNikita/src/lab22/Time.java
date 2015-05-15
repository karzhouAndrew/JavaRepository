package lab22;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    //
    public Time(int seconds, int minutes, int hours) {
        timeInitializer(seconds, minutes, hours);
    }

    public Time(int seconds) {
        timeInitializer(seconds);
    }


    public int getAmountSeconds() {
        return this.seconds + this.minutes * 60 + this.hours * 3600;
    }

    public boolean compareTimeObjects(Time anotherTime) {
        return getAmountSeconds() == anotherTime.getAmountSeconds();
    }

    private void timeInitializer(int seconds, int minutes, int hours) {
        this.seconds = seconds % 60;
        this.minutes = (seconds / 60 + minutes) % 60;
        //System.out.println(this.minutes);
        this.hours = minutes / 60 + hours;
        //System.out.println(this.hours);
    }
    private void timeInitializer(int seconds) {
        this.seconds = seconds % 60;
        int minutes =  (seconds - this.seconds) / 60;
        this.minutes = ((seconds - this.seconds) / 60) % 60;
        this.hours = ((minutes - this.minutes) / 60);
    }

 /*   int s = 6188392;
    int sec = s % 60;
    int m = (s - sec) / 60;
    int min = m % 60;
    int h = (m - min) / 60;
    int hour = h % 24;
    int d = (h - hour) / 24;*/
}
