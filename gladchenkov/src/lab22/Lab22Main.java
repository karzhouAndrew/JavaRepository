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
        Lab22 Time = new Lab22(546, 4567, 76);
        Time.setHour(5678);
        Time.getInfo();
        Time.getHour();
        System.out.println();


        Lab22 Time2 = new Lab22(546, 4567, 76);
        Time2.getMin();
        Time2.setHour(5678);
        Time2.getInfo();

        if (Time.equals(Time2)) {
            System.out.println("Объекты Time и Time 2 равны");
        } else {
            System.out.println("Объекты Time и Time 2 не равны");
        }
    }


}