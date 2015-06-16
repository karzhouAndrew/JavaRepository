package lab32;

/**
 * Задание 32
 * Записать в двоичный файл 20 случайных чисел. Прочитать записан-ный файл, распечатать числа и их среднее арифметическое.
 */
public class Lab32 {
    public static void main(String[] args) {
        BinaryFile binaryFile = new BinaryFile(".binaryFile.txt");
        binaryFile.writeFile(20);
        System.out.println("Числа из файла = " + binaryFile.readFile());
        System.out.println("Среднее значение = " + binaryFile.average());
    }
}
