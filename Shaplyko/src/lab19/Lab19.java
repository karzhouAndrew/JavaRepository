package lab19;

/**
 * Задание 19
 * Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
 * а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Lab19 {
    public static void main(String[] args) {
        String str = "Я изучаю Java";
        String srtPlus = " и английский тоже надо";
        Calculation calculation = new Calculation();
        System.out.println("Время выполнения при помощи оператора сложения " + calculation.methodString(str, srtPlus));
        System.out.println("Время выполнения при помощи " +
                "StringBuilder и метода append " + calculation.methodBuilder(str, srtPlus));
    }
}


