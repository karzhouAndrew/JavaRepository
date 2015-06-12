package task32;

//Записать в двоичный файл 20 случайных чисел.
//Прочитать записанный файл, распечатать числа и их среднее арифметическое.

import java.io.IOException;

public class TaskTest {
    public static void main(String[] args) throws IOException {
        FileManager file = new FileManager("./ivanchuk/src/task32/file.dat");
        if (file.writeRandomNumbers() && file.read()) {
            System.out.println("Все числа: " + file.getNumbers());
            System.out.println("Среднее арифметическое: " + file.calcArithmeticAverage());
        }
    }
}
