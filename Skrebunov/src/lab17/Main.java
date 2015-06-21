package lab17;

/**Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться
 * несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */
public class Main {
    public static void main(String[] args) {
        Words empty = new Words();
        int numbers = empty.wordsNumber("  .! Подсчитать , количество слов ?");
        System.out.println("Количество слов " + numbers);
    }
}
