package lab22;

import java.util.Scanner;

/* Задание 22. Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов (метод должен работать аналогично compareTo в строках). Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение. */
public class Task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ПЕРВЫЙ интервал времени в виде полного количества СЕКУНД: ");
        int givenSeconds = scan.nextInt();
        TimeInterval firstInterval = new TimeInterval(givenSeconds);
        System.out.print("Введите количество ЧАСОВ ВТОРОГО интервала времени: ");
        int givenHours = scan.nextInt();
        System.out.print("Введите количество МИНУТ ВТОРОГО интервала времени: ");
        int givenMinutes = scan.nextInt();
        System.out.print("Введите количество СЕКУНД ВТОРОГО интервала времени: ");
        givenSeconds = scan.nextInt();
        scan.close();
        TimeInterval secondInterval = new TimeInterval(givenHours, givenMinutes, givenSeconds);
        System.out.println("Результат приведения ПЕРВОГО интервала к формату ЧЧ:ММ:СС - " + firstInterval.getValueInHMSFormat());
        System.out.println("Результат приведения ВТОРОГО интервала к формату ЧЧ:ММ:СС - " + secondInterval.getValueInHMSFormat());
        System.out.println("Полное количество СЕКУНД ВТОРОГО интервала времени: " + secondInterval.getTotalSecondsValue());
        int differInterval = firstInterval.compareTo(secondInterval);
        System.out.println("Результат сравнения ПЕРВОГО и ВТОРОГО интервалов (их разность в секундах): " + differInterval);
        TimeInterval differenceInterval = new TimeInterval(Math.abs(differInterval));
        System.out.println("Результат приведения РАЗНОСТИ интервалов к формату ЧЧ:ММ:СС - " + differenceInterval.getValueInHMSFormat());
        TimeInterval summaryInterval = new TimeInterval(firstInterval.getTotalSecondsValue() + secondInterval.getTotalSecondsValue());
        System.out.println("Сумма ПЕРВОГО и ВТОРОГО интервалов (в секундах): " + summaryInterval.getTotalSecondsValue());
        System.out.println("Результат приведения СУММЫ интервалов к формату ЧЧ:ММ:СС - " + summaryInterval.getValueInHMSFormat());
        System.out.println("Строковые представления интервалов: первого - " + firstInterval + ", второго - " + secondInterval + ", разности - " + differenceInterval + ", суммы - " + summaryInterval);
    }
}