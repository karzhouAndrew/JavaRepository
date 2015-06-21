package lab31;

/**
 * Имеется файл с текстом, в котором присутствуют числа.
 * Найти все числа, распечатать, посчитать сумму,
 * убрать все повторяющиеся числа и снова распечатать.
 */
public class Task {
    public static void main(String[] args) {
        FileNumbers fileNumbers = new FileNumbers();
        fileNumbers.addNumbers("file.txt");
        System.out.println(fileNumbers);
        System.out.println(fileNumbers.calculateSum());
        fileNumbers.removeDuplicate();
        System.out.println(fileNumbers);
    }
}