package lab22;

/**
 * Создать класс и объекты описывающие промежуток времени.
 * Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте,
 * сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class Task {
    public static void main(String[] args) {
        Time firstTimeObj = new Time(7813);
        Time secondTimeObj = new Time(1, 3, 20);
        System.out.println("Первый объект:");
        System.out.println(firstTimeObj);
        System.out.println("Общее кол-во секунд: " + firstTimeObj.totalSeconds());
        System.out.println("\nВторой объект:");
        System.out.println(secondTimeObj);
        System.out.println("Общее кол-во секунд: " + secondTimeObj.totalSeconds());
        System.out.println("\nОбъекты равны? - " + firstTimeObj.compareTo(secondTimeObj));
        System.out.println("\nПрисвоим значение времени первого объекта второму.");
        secondTimeObj.setSeconds(firstTimeObj.getSeconds());
        secondTimeObj.setMinutes(firstTimeObj.getMinutes());
        secondTimeObj.setHours(firstTimeObj.getHours());
        System.out.println("\nТеперь второй объекта: ");
        System.out.println(secondTimeObj);
        System.out.println("Общее кол-во секунд: " + secondTimeObj.totalSeconds());
        System.out.println("\nОбъекты равны? - " + firstTimeObj.compareTo(secondTimeObj));
    }
}
