package lab31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму, убрать все
повторяющиеся числа и снова распечатать.
 */
public class NumbersTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("D:\\env\\Java\\JavaRepository_1\\tikhomirov\\src\\lab31\\example.txt"));
        String result = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Исходный текст файла:");
        while (result != null) {
            System.out.print(result);
            stringBuilder.append(result);
            result = bufferedReader.readLine();
            System.out.println();
        }
        String str = stringBuilder.toString();
        NumbersPerformance performance = new NumbersPerformance();
        System.out.println("Встречающиеся числа в файле: " + performance.printNumbers(str));
        System.out.println("Сумма данных чисел: " + performance.sumNumbers());
        System.out.println("Те же числа после удаления повторов: " + performance.deleteDuplicateNumbers());
    }
}