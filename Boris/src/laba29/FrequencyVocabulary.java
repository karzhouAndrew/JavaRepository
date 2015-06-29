package laba29;

//Имеется текст. Следует составить для него частотный словарь.

import java.util.HashMap;
import java.util.Map;

public class FrequencyVocabulary {
    private static final int INCREASE = 1;
    private final static String WORD_SPLIT_REGEX = "\\W+";
    private Map<String, Integer> vocabularyFrequencyWord;

    public FrequencyVocabulary() {
        vocabularyFrequencyWord = new HashMap<>();
    }

    public void addTextToVocabulary(String text) {
        String[] words = text.split(WORD_SPLIT_REGEX);
        for (String word : words) {
            addWordToVocabulary(word);
        }
    }

    private void addWordToVocabulary(String word) {
        if (vocabularyFrequencyWord.containsKey(word)) {
            increaseValueKeyMap(word);
        } else {
            vocabularyFrequencyWord.put(word, INCREASE);
        }
    }

    private void increaseValueKeyMap(String word) {
        vocabularyFrequencyWord.put(word, vocabularyFrequencyWord.get(word) + INCREASE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FrequencyVocabulary that = (FrequencyVocabulary) o;

        if (vocabularyFrequencyWord != null ? !vocabularyFrequencyWord.equals
                (that.vocabularyFrequencyWord) : that.vocabularyFrequencyWord != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return vocabularyFrequencyWord != null ? vocabularyFrequencyWord.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FrequencyVocabulary{" +
                "vocabularyFrequencyWord=\n" + getColon(vocabularyFrequencyWord) +
                '}';
    }

    private StringBuilder getColon(Map<String, Integer> words) {
        StringBuilder strB = new StringBuilder();
        for (String word : words.keySet()) {
            strB.append(word).append("=").append(words.get(word)).append("\n");
        }
        return strB;
    }
}
