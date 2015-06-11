package task31;

//Имеется файл с текстом, в котором присутствуют числа.
//Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.

import java.util.List;

public class TaskTest {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("./ivanchuk/src/task31/file");
        if (textFile.readFile()) {
            List<Integer> numbers = textFile.searchNumbers();
            System.out.println(numbers);
            System.out.println(textFile.calcSum(numbers));
            System.out.println(textFile.deleteRepeatingNumbers(numbers));
        }
    }
}
