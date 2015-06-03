package work.laba7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Из текста удалить все слова заданной длины, которые начинаются на согласную букву.
public class DeletingWordWithSpecialLength {
    private final static String SPECIAL_WORD_REGEX = "^[[B-Zb-zБ-Ъб-ъ0-9]&&[^eEyYuUiIoOуУеЕэЭоОыЫиИ]]\\w*";
    private final static String SPECIAL_FIRST_LITERAL_REGEX = "[[B-Zb-zБ-Ъб-ъ0-9]&&[^eEyYuUiIoOуУеЕэЭоОыЫиИ]]";
    private final static Pattern WORD_PATTERN = Pattern.compile(SPECIAL_WORD_REGEX);

    public static StringBuilder getTextWithoutWordStartingConsonantAndSpecifiedLength
            (String stringText, int deletingWordLength, boolean isBigMethod) {
        if (deletingWordLength < 0) {
            return new StringBuilder("Exception. Negative word length.");
        } else if (deletingWordLength == 0) {
            return new StringBuilder(stringText);
        } else {
            if (isBigMethod) {
                return getTextWithOutSpecialWord(stringText, deletingWordLength);
            } else {
                return getTextWithOutSpecialWordAnotherRealization(stringText, deletingWordLength);
            }
        }
    }

    private static StringBuilder getTextWithOutSpecialWordAnotherRealization(String text, int length) {
        StringBuilder changedText = new StringBuilder(" " + text + " ");
        Matcher matcher = Pattern
                .compile(getSpecialWordRegex(length))
                .matcher(changedText);
        while (matcher.find()) {
            changedText.delete(matcher.start() + 1, matcher.end() - 1);
            matcher.reset(changedText);
        }
        return changedText
                .deleteCharAt(0)
                .deleteCharAt(changedText.length() - 1);
    }

    private static String getSpecialWordRegex(int length) {
        return "\\W" + SPECIAL_FIRST_LITERAL_REGEX + "\\w{" + (length - 1) + "," + (length - 1) + "}\\W";
    }

    private static StringBuilder getTextWithOutSpecialWord(String stringText, int deletingWordLength) {
        String[] arrayTextSplitRegexWord = stringText.split("\\w+");
        String[] arrayTextSplitExceptRegexWord = stringText.split("\\W+");
        return replaceSpecialWordAndAssembleText(deletingWordLength, arrayTextSplitRegexWord, arrayTextSplitExceptRegexWord);
    }

    private static StringBuilder replaceSpecialWordAndAssembleText(int deletingWordLength, String[] arrayTextSplitRegexWord, String[] arrayTextSplitExceptRegexWord) {
        StringBuilder changeableText = new StringBuilder();
        for (int i = 0; i < arrayTextSplitRegexWord.length; i++) {
            changeableText.append(arrayTextSplitRegexWord[i]);
            if (i < arrayTextSplitExceptRegexWord.length) {
                changeableText.append(replaceSpecialWord(deletingWordLength, arrayTextSplitExceptRegexWord[i]));
            }
        }
        return changeableText;
    }

    private static String replaceSpecialWord(int deletingWordLength, String partOfTextToSpace) {
        Matcher matcher = WORD_PATTERN.matcher(partOfTextToSpace);
        while (matcher.find()) {
            if (matcher.group().length() == deletingWordLength) {
                partOfTextToSpace = partOfTextToSpace.replaceFirst(matcher.group(), "");
            }
        }
        return partOfTextToSpace;
    }


}
