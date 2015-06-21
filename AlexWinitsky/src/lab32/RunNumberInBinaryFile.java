package lab32;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Задание 32
 * Записать в двоичный файл 20 случайных чисел.
 * Прочитать запи-санный файл, распечатать числа и их среднее арифметическое.
 */
public class RunNumberInBinaryFile {
    public static void main(String[] args) {
        BinaryFile binaryFile = new BinaryFile();
        binaryFile.writeFile();
        System.out.println("Чила из двоичного файла");
        binaryFile.printNumber(binaryFile.readFile());
        System.out.println("Среднеарифметическое число " + binaryFile.arithmeticMean(binaryFile.readFile()));
    }
}
