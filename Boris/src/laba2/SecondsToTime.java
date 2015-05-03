package laba2;

//Task 2. Continue example, add calculating days and weeks. To take out result.

public class SecondsToTime {
    public static void main(String[] args) {
        int allSeconds = 7 * 24 * 60 * 60;
        int seconds = allSeconds % 60;
        int allMinutes = (allSeconds - seconds) / 60;
        int minutes = allMinutes % 60;
        int allHours = (allMinutes - minutes) / 60;
        int hours = allHours % 24;
        int allDay = (allHours - hours) / 24;
        int dow = allDay % 7;
        int allWeek = (allDay - dow) / 7;
        System.out.printf("%d секунд - это %d недель %d день недели %d часов %d минут %d секунд",
                allSeconds, allWeek, dow, hours, minutes, seconds);
    }
}

