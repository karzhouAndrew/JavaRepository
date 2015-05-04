package Lab19;

/**
 * Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора с
 * ложения и String, а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Lab19Main {
    public static void main(String[] args) {
        Lab19 lab = new Lab19();
        lab.SpeedMethodString("java", "the", "best", "language");
        lab.SpeedMethodAppend("java", "the", "best", "language");

    }
}
