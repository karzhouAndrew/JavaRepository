package lab17;

/**
 * Имеется строка с текстом. Подсчитать кол-во слов в тексте. Надо учесть , что слова могут разделяться несколькими
 * пробелами, так же в начале и в конце текста могут быть пробелы, но могут и отсутствовать.
 */

public class WordsNumber {

    public static void main(String[] args) {
        String sentence = " one two three     four= five, six. ";
        sentence = sentence.trim();
        int wordsNumber = 0;
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                wordsNumber++;
            }
        }
        System.out.println("Words number is: " + (wordsNumber + 1));
    }
}
