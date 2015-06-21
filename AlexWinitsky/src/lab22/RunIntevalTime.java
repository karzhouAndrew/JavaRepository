package lab22;

/**
 * Задание 22
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
 * секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте,
 * сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */
public class RunIntevalTime {
    public static void main(String[] args) {
        IntervalTime firstInterval = new IntervalTime(2400);
        IntervalTime secondInterval = new IntervalTime(15, 20, 30);
        System.out.println("firstIntervale = " + firstInterval);
        System.out.println("secondInterval = " + secondInterval);
        System.out.println("Интервал в секундах для первого объекта " + firstInterval.getIntervalInSecond());
        System.out.println("Интервал в секундах для второго объекта " + secondInterval.getIntervalInSecond());

        int number = firstInterval.compareInterval(secondInterval);
        if (number == 0) {
            System.out.println("Помежутки времени одинаковые");
        } else {
            System.out.println("Интревал объектов отличаются " + number + " секунд");
        }

    }
}
