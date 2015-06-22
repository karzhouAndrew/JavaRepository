package lab29;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private final String WORD_PATTERN = "[А-Яа-яЁёA-Za-z]+";

    public TreeMap<String, Integer> getWordFrequencyMapIgnoreCase(String givenText) {
        Pattern patternWord = Pattern.compile(WORD_PATTERN);
        Matcher matcher = patternWord.matcher(givenText.toLowerCase());
        TreeMap<String, Integer> resultMap = new TreeMap<>();
        while (matcher.find()) {
            String currentWord = matcher.group();
            if (resultMap.containsKey(currentWord)) {
                resultMap.put(currentWord, resultMap.get(currentWord) + 1);
            } else {
                resultMap.put(currentWord, 1);
            }
        }
        return resultMap;
    }
}