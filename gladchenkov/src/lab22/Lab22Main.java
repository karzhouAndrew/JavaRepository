
package lab22;

/**
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен
 * задаваться тремя свойствами: секундами, минутами, часами. Сделать методы для получения
 * полного количества секунд в объекте, сравнения двух объектов (метод должен работать
 * аналогично compareTo в строках). Создать два конструктора: получающий общее количество
 * секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее
 * на ваше усмотрение..
 */
public class Lab22Main {
    public static void main(String[] args) {
        Lab22 time = new Lab22(546, 4567, 76);
        time.setHour(5678);
        System.out.println(time.getInfo());
        System.out.println(time.getHour());
        System.out.println(time.toString());


        Lab22 time2 = new Lab22(546, 4567, 76);
        System.out.println(time2.getMin());
        time2.setHour(5678);
        System.out.println(time2.getInfo());
        System.out.println(time.toString());

        if (time.equals(time2)) {
            System.out.println("Объекты Time и Time 2 равны");
        } else {
            System.out.println("Объекты Time и Time 2 не равны");
        }
    }


}