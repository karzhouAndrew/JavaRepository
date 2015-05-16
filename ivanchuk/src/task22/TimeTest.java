package task22;


public class TimeTest {
    public static void main(String[] args) {
        TimeInterval interval1 = new TimeInterval(300000);
        TimeInterval interval2 = new TimeInterval(83, 19, 8);
        System.out.println("Полное количество секунд первого отрезка времени: " + interval1.allSeconds());
        System.out.println("Полное количество секунд второго отрезка времени: " + interval2.allSeconds());
        System.out.println("Первый отрезок времени: " + interval1.getHours() + " ч. " +
                interval1.getMinutes() + " м. " + interval1.getSeconds() + " с.");
        System.out.println("Второй отрезок времени: " + interval2.getHours() + " ч. " +
                interval2.getMinutes() + " м. " + interval2.getSeconds() + " с.");
        System.out.println("Результат сравнения первого отрезка времени со вторым: " + interval1.compareTo(interval2));
    }
}
