package lab30;

/**
 * Создать файл с текстом, прочитать,
 * подсчитать в тексте количество знаков препинания и слов.
 */
public class Task {
    public static void main(String[] args) {
        FileWork fileText = new FileWork();
        fileText.readFile("c:\\Projects\\JavaRepository\\apetsenak\\src\\lab30\\text.txt");
        System.out.println(fileText);
        System.out.println("Кол-во слов в тексте: " + fileText.wordsCount());
        System.out.println("Кол-во знаков препинания : " + fileText.punctuationsCount());
    }
}
