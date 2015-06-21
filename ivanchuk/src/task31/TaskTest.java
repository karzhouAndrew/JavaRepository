package task31;

//Имеется файл с текстом, в котором присутствуют числа.
//Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.

import java.util.List;

public class TaskTest {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("./ivanchuk/src/task31/file");
        if (textFile.readFile()) {
            List<Integer> numbers = textFile.searchNumbers();
            System.out.println("Числа: " + numbers);
            System.out.println("Сумма: " + textFile.calcSum(numbers));
            System.out.println("Числа после удаления повторяющихся: " + textFile.deleteRepeatingNumbers(numbers));
        } else {
            System.out.println("Ошибка чтения файла!!!");
        }
    }
}
