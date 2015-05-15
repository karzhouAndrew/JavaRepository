package addit07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private final String CONSONANTS_PATTERN = "[А-Яа-я&&[^АЕЁИОУЫЭЮЯаеёиоуыэюя]]";
    private final String VOWELS_PATTERN = "[АЕЁИОУЫЭЮЯаеёиоуыэюя]";
    private final String SENTENCE_PATTERN = "[^.!?\n]+[.!?]";
    private final String WHITESPACE_PATTERN = "\\s";

    public int countConsonants(String givenStr) {
        int consonantsCounter = 0;
        for (int i = 0; i < givenStr.length(); i++) {
            if (String.valueOf(givenStr.charAt(i)).matches(CONSONANTS_PATTERN)) {
                consonantsCounter++;
            }
        }
        return consonantsCounter;
    }

    public int countVowels(String givenStr) {
        int vowelsCounter = 0;
        for (int i = 0; i < givenStr.length(); i++) {
            if (String.valueOf(givenStr.charAt(i)).matches(VOWELS_PATTERN)) {
                vowelsCounter++;
            }
        }
        return vowelsCounter;
    }

    public int countSpaces(String givenStr) {
        int spacesCounter = 0;
        for (int i = 0; i < givenStr.length(); i++) {
            if (givenStr.charAt(i) == ' ') {
                spacesCounter++;
            }
        }
        return spacesCounter;
    }

    public int countParagraphs(String givenStr) {
        int paragraphsCounter = 0;
        for (int i = 0; i < givenStr.length(); i++) {
            if (givenStr.charAt(i) == '\n') {
                paragraphsCounter++;
            }
        }
        return paragraphsCounter;
    }

    public String countAllSentencesSimbols(String givenStr) {
        StringBuilder resultStrBuilder = new StringBuilder();
        Pattern sentencePatt = Pattern.compile(SENTENCE_PATTERN);
        Matcher matcher = sentencePatt.matcher(givenStr);
        if (matcher.find()) {
            int sentenceNumber = 1;
            do {
                resultStrBuilder.append("\n").append(sentenceNumber).append("-е предложение, ").append(matcher.group().length()).append(" символов: ").append(matcher.group());
                sentenceNumber++;
            } while (matcher.find());
            return resultStrBuilder.toString();
        } else {
            return "Внимание!!! Не обнаружено ни одного из знаков препинания, разделяющих предложения (\'.\' либо \'!\' либо \'?\')";
        }
    }

    public String removeAllWhitespaceChars(String givenStr) {
        return givenStr.replaceAll(WHITESPACE_PATTERN, "");
    }
}
