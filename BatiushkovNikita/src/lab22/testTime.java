package lab22;

// Создать класс и объекты описывающие промежуток времени.
// Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
// Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
// (метод должен работать аналогично compareTo в строках).
// Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
// Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class testTime {
    public static void main(String[] args) {
        Time time1 = new Time(0, 120, 0);
        Time time2 = new Time(7200);

        boolean isEqual = time1.compareTimeObjects(time2);

        System.out.println("time1" + "\n" + time1.toString());
        System.out.println("time2" + "\n" + time2.toString());
        System.out.println();
        System.out.println("Is time1 equal time2?" + "\n" + isEqual);
    }
}
