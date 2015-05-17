package lab17;

/**
 * * Имеется строка с текстом. Подсчитать количество слов в тексте.
 * Желательно учесть, что слова могут разделяться несколькими пробелами,
 * в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */
public class TestNumberOfWords {
    public static void main(String[] args) {
        String str = "  Найти в строке не только    запятые, но  и другие знаки   препинания и другое. ";
        NumberOfWords number = new NumberOfWords();
        System.out.println("Чило слов строке равно " + number.calculateWords(str));
    }
}
