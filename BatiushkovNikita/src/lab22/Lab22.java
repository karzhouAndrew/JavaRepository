package lab22;

// Создать класс и объекты описывающие промежуток времени.
// Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
// Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
// (метод должен работать аналогично compareTo в строках).
// Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
// Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class Lab22 {
    public static void main(String[] args) {
        Time time = new Time(3600, 0, 0);
        //Time time2 = new Time(1, 3, 0);
        Time time3 = new Time(3600);
        boolean isEqual = time.compareTimeObjects(time3);
        //time.getAmountSeconds();
        System.out.println(isEqual);
/*        System.out.println(time.getSeconds());
        System.out.println(time.getHours());
        System.out.println(time2.getSeconds());*/
        //Object time1 = new Time();

    }

    public static void output() {


    }
}
