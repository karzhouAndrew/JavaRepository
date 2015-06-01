package stringTask1;

//1.Найти и вывести предложение из текста, в котором максимальное количество одинаковых слов.
public class EqualWordCounter {
    public String[] splitToSentences(String string) {
        return string.split("[.!?]");
    }

    public String[] splitToWords(String string) {
        return string.split("[ ,:;]+");
    }

    public int[] calculateMaxEqualWordInSentence(String string) {
        String[] sentences = splitToSentences(string.trim());
        int[] maxEqualWordsInSentence = new int[sentences.length];

        for (int k = 0; k < sentences.length; k++) {
            String[] words = splitToWords(sentences[k].trim());
            int[] numberEquals = new int[words.length - 1];
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        numberEquals[i]++;
                    }
                }
            }
            maxEqualWordsInSentence[k] = findMax(numberEquals);

        }
        return maxEqualWordsInSentence;
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}

