package laba22;

//Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
//секундами, минутами и часами. Сделать методы для получения полного кол-ва секунд в объекте, сравнение двух объектов.
//Создать 2 конструктора: получающий общее кол-во секунд, и часы, минуты и секунды по отдельности.
// Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class TimeInterval {

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int hours, int minutes, int seconds) {
        secondsValid(seconds);
        minutesValid(minutes);
        hoursValid(hours);
    }

    private void secondsValid(int seconds) {
        if (seconds < 0) {
            this.seconds = 0;
            System.out.println("Exception not valid value seconds.");
        } else {
            this.seconds = seconds % 60;
            this.minutes = seconds / 60;
        }
    }

    private void minutesValid(int minutes) {
        minutes += this.minutes;
        if (minutes < 0) {
            this.minutes += 0;
            System.out.println("Exception not valid value minutes.");
        } else {
            this.minutes = minutes % 60;
            this.hours = minutes / 60;
        }
    }

    private void hoursValid(int hours) {
        hours += this.hours;
        if (hours < 0) {
            this.hours = 0;
            System.out.println("Exception not valid value hours.");
        } else {
            this.hours = hours;
        }
    }

    public TimeInterval(int seconds) {
        this(0, 0, seconds);
    }

    public int intervalInSeconds() {
        return (hours * 60 + minutes) * 60 + seconds;
    }

    public int intervalCompare(TimeInterval interval) {
        if (this.hours - interval.hours != 0) {
            return this.hours - interval.hours;
        } else if (this.minutes - interval.minutes != 0) {
            return this.minutes - interval.minutes;
        } else {
            return (this.seconds - interval.seconds);
        }
    }

    @Override
    public String toString() {
        return getClass().getName() + " хранит в себе введенный промежуток времени" +
                " равный " + hours + " часам " + minutes + " минутам и " + seconds + " секундам.\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        TimeInterval interval = (TimeInterval) obj;
        return this.intervalCompare(interval) == 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        secondsValid(seconds);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        minutesValid(minutes);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        hoursValid(hours);
    }
}
