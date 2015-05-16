package task22;
//Создать класс и объекты описывающие промежуток времени.
// Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
// Сделать методы для получения полного количества секунд в объекте,
// сравнения двух объектов (метод должен работать аналогично compareTo в строках).
// Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
// Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int secondsFull) {
        this.seconds = secondsFull % 60;
        this.minutes = ((secondsFull - this.seconds) / 60) % 60;
        this.hours = (((secondsFull - this.seconds) / 60) - this.minutes) / 60;
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

    public int calculateFullSeconds ()   {
         return this.seconds + this.minutes * 60 + this.hours * 60 * 60;
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TimeInterval)) return false;

        TimeInterval that = (TimeInterval) o;

        if (hours != that.hours) return false;
        if (minutes != that.minutes) return false;
        if (seconds != that.seconds) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = seconds;
        result = 31 * result + minutes;
        result = 31 * result + hours;
        return result;
    }
}


