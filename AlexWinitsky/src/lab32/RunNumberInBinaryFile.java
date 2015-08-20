package lab32;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Задание 32
 * Записать в двоичный файл 20 случайных чисел.
 * Прочитать запи-санный файл, распечатать числа и их среднее арифметическое.
 */
public class RunNumberInBinaryFile {
    public static void main(String[] args) {
        String path = "./AlexWinitsky/src/lab32/Number.dat";

        BinaryFile binaryFile = new BinaryFile();
        binaryFile.writeFile(path);
        System.out.println("Чила из двоичного файла");
        binaryFile.printNumber(binaryFile.readFile(path));
        System.out.println("Среднеарифметическое число " + binaryFile.arithmeticMean(binaryFile.readFile(path)));
    }
}
