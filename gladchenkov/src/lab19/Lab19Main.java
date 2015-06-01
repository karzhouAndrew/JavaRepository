package lab19;

/**
 * Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора с
 * ложения и String, а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Lab19Main {
    public static void main(String[] args) {
        Lab19 lab = new Lab19();
        lab.speedMethodString("java");
        lab.speedMethodAppend("java");

    }
}