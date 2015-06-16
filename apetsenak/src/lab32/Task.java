package lab32;


/**
 * Записать в двоичный файл 20 случайных чисел.
 * Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
public class Task {
    public static void main(String[] args) {
        String fileName = "binary.dat";
        FileWork fileWork = new FileWork();
        fileWork.writeFile(fileName);
        System.out.println("Содержимое файла: ");
        fileWork.printFile(fileName);
        System.out.println("Среднее арифметическое: " + fileWork.findAverage(fileName));
    }
}
