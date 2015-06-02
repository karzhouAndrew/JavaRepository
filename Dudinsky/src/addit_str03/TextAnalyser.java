package addit_str03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalyser {
    private final String SENTENCE_PATTERN = "[^.!?]+[.!?]";
    private final String SPLIT_TO_WORDS_PATTERN = "[^a-zA-ZА-Яа-яёЁ_0-9]+";

    public String findFirstSentUniqueWords(String givenStr) {
        StringBuilder resultStrBuilder = new StringBuilder();
        Pattern firstSentPatt = Pattern.compile(SENTENCE_PATTERN);
        Matcher matcher = firstSentPatt.matcher(givenStr);
        if (matcher.find()) {
            String firstSentenceStr = matcher.group();
            String[] firstSentenceArr = firstSentenceStr.split(SPLIT_TO_WORDS_PATTERN);
            String otherSentences = givenStr.substring(matcher.end());
            for (String eachWord : firstSentenceArr) {
                if (!otherSentences.contains(eachWord)) {
                    resultStrBuilder.append(eachWord).append(" ");
                }
            }
            return resultStrBuilder.toString();
        } else {
            return "Внимание!!! Не обнаружено ни одного из знаков препинания, разделяющих предложения (\'.\' либо \'!\' либо \'?\')";
        }
    }
}
