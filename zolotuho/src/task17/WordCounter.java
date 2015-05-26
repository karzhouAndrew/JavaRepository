package task17;

//Имеется строка с текстом. Подсчитать количество слов в тексте.
// Желательно учесть, что слова могут разделяться несколькими пробелами,
// в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
public class WordCounter {

    public int calculateWords(String str) {
        int counterWords = 0;
        for (int i = 0; i < str.length(); i++) {
           char symbol = str.charAt(i);
            if (symbol == ' ') {
                if (i == 0) {
                    counterWords--;
                }
                for (int j = i; j < str.length(); j++) {
                    symbol = str.charAt(j);
                    if (symbol != ' ') {
                        counterWords++;
                        i = j;
                        break;
                    }
                }
            }
        }
        counterWords++;
        return counterWords;
    }
}