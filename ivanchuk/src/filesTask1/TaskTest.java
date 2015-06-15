package filesTask1;

//Создать и заполнить файл случайными целыми числами.
//Отсортировать содержимое файла по возрастанию.

public class TaskTest {
    public static void main(String[] args) {
        NumbersFile file = new NumbersFile("./ivanchuk/src/filesTask1/numbers.txt");
        if (file.writeRandomNumbers() && file.read()) {
            System.out.println("Цифры из файла: " + file.getNumbers());
            System.out.println("Отсортированные цифры: " + file.sort());
        }
    }
}
