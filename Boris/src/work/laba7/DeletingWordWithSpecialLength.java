package work.laba7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Из текста удалить все слова заданной длины, которые начинаются на согласную букву.
public class DeletingWordWithSpecialLength {
    private final static String SPECIAL_WORD_REGEX = "^[[B-Zb-zБ-Ъб-ъ0-9]&&[^eEyYuUiIoOуУеЕэЭоОыЫиИ]]\\w*";
    private final static Pattern WORD_PATTERN = Pattern.compile(SPECIAL_WORD_REGEX);

    public static String DeleteWordStartingConsonantAndSpecifiedLength(String stringText, int deletingWordLength) {
        if (deletingWordLength < 0) {
            return "Exception. Negative length.";
        } else if (deletingWordLength == 0) {
            return stringText;
        } else {
            return getTextWithOutSpecialWord(stringText, deletingWordLength).toString();
        }
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
