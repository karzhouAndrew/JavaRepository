package lab17;

/**
 * меется  строка  с  текстом.  Подсчитать  количество  сло
 * в  в  тексте.
 * Желательно учесть, что слова могут разделяться неск
 * олькими пробелами,
 * в  начале  и  конце  текста  также  могут  быть  пробелы,  н
 * о  могут  и
 * отсутствовать.
 */
public class AnalizeString {

    public int wordCount(String str) {
        str = str.trim();
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            int symbol = str.charAt(i);
            int predSymbol = str.charAt(i - 1);
            if (symbol != ' ' && (predSymbol == '.' || predSymbol == ',' || predSymbol == ';' || predSymbol == ':'
                    || predSymbol == '?' || predSymbol == '!' || predSymbol == '-' || predSymbol == ' ')) {
                count++;
            }
        }
        return count;
    }
}
