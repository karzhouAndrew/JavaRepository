package lab31;

/**
 * Задание 31
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
 * убрать все повторяющиеся числа и снова распечатать.
 */
public class Lab31 {
    public static void main(String[] args) {
        FileWithNumber fileWithNumber = new FileWithNumber();
        fileWithNumber.readFile();
        System.out.println("Встречающиеся числа в файле: " + fileWithNumber.findNumber());
        System.out.println("Сумма чисел: " + fileWithNumber.amountNumbers());
        System.out.println("После удаления повторяющихся: " + fileWithNumber.removeSameNumbers());
    }
}
