package task30;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

public class TaskTest {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("./ivanchuk/src/task30/textFile");
        boolean fileIsRead = textFile.readFile();
        if (fileIsRead) {
            System.out.println("Количество знаков препинания:" + textFile.calcPunctuationQuantity());
            System.out.println("Количество слов: " + textFile.calcWordsQuantity());
        } else {
            System.out.println("Ошибка чтения файла!!!");
        }
    }
}
