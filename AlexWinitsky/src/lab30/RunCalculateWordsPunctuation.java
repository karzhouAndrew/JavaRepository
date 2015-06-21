package lab30;

/**
 * Задание 30
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */
public class RunCalculateWordsPunctuation {
    public static void main(String[] args) {
        TextClass textClass = new TextClass();
        System.out.println("Количестов слов в тексте " + textClass.calculateWords(textClass.readFile()));
        System.out.println("Количестов знаков припинания в тексте " + textClass.claculatePunctuation(textClass.readFile()));
    }
}
