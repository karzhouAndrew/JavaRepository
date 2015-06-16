package lab22;

/**
 * Задание 22
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя
 * свойствами: секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте,
 * сравнения двух объектов (метод должен работать аналогично compareTo в строках). Создать два конструктора:
 * получающий общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
 * Прочее на ваше усмотрение.
 */
public class Lab22 {
    public static void main(String[] args) {
        Time time1 = new Time(60, 1, 0);
        time1.getSecond();
        time1.getMinute();
        time1.getHour();
        System.out.println("Общее время равно = " + time1.amountSecond());
        Time time2 = new Time(61, 2, 0);
        time2.getSecond();
        time2.getMinute();
        time2.getHour();
        System.out.println("Общее время равно = " + time2.amountSecond());
        time1.compareToTime(time2);
    }
}

