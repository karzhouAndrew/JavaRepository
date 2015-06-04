package stringTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditor {

    public static final String ALL_SENTENCES_REGEX = "[А-Я][а-яА-Я0-9,\\s]+[.!?]";
    public static final String INTERROG_SENTENCES_REGEX = "[А-Я][а-яА-Я0-9,\\s]+[?]";
    public static final String ALL_WORDS_REGEX = "\\b[а-яА-Я0-9]+\\b";

    public String[] devideIntoSentences(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String[] sentences = new String[0];
        while (matcher.find()) {
            sentences = addElement(sentences, matcher.group());
        }
        return sentences;
    }

    public String[] addElement(String[] oldString, String element) {
        String[] newString = new String[oldString.length + 1];
        System.arraycopy(oldString, 0, newString, 0, oldString.length);
        newString[oldString.length] = element;
        return newString;
    }

    public String[] mergeArrays(String[] firstArray, String[] secondArray) {
        String[] newArray = new String[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);
        return newArray;
    }

    public String[] devideIntoWords(String sentence, String wordRegex) {
        Pattern pattern = Pattern.compile(wordRegex);
        Matcher matcher = pattern.matcher(sentence);
        String[] words = new String[0];
        while (matcher.find()) {
            words = addElement(words, matcher.group());
        }
        return words;
    }


    public int wordReapetNum(String sentence) {
        int repeatNum = 0;
        String[] words = devideIntoWords(sentence, ALL_WORDS_REGEX);
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) == 0) {
                    repeatNum++;
                }
            }
        }
        return repeatNum;
    }

    public String findSentenceMaxNumWordRepeated(String text) {
        int maxRepeatNum = 0;
        int indexSentence = 0;
        String[] sentences = devideIntoSentences(text, ALL_SENTENCES_REGEX);
        for (int i = 0; i < sentences.length; i++) {
            if (wordReapetNum(sentences[i]) > maxRepeatNum) {
                maxRepeatNum = wordReapetNum(sentences[i]);
                indexSentence = i;
            }
        }
        return sentences[indexSentence];
    }


    public String[] sortSentenceAscending(String text) {
        String[] sentences = devideIntoSentences(text, ALL_SENTENCES_REGEX);
        for (int i = 0; i < sentences.length - 1; i++) {
            for (int j = i + 1; j < sentences.length; j++) {
                if (devideIntoWords(sentences[i], ALL_WORDS_REGEX).length > devideIntoWords(sentences[j], ALL_WORDS_REGEX).length) {
                    String tempSentence = sentences[i];
                    sentences[i] = sentences[j];
                    sentences[j] = tempSentence;
                }
            }
        }
        return sentences;
    }

    public void printSentencesAscendingWordsNum(String text) {
        for (String sentence : sortSentenceAscending(text)) {
            System.out.println(sentence);
        }
    }


    public String findUniqueWordInFirstSent(String text) {
        String firstSentence = devideIntoSentences(text, ALL_SENTENCES_REGEX)[0];
        String[] firstSentenceWords = devideIntoWords(firstSentence, ALL_WORDS_REGEX);
        String[] allWords = devideIntoWords(text, ALL_WORDS_REGEX);
        for (String word : firstSentenceWords) {
            boolean isUnique = true;
            for (int j = firstSentenceWords.length; j < allWords.length; j++) {
                if (word.compareToIgnoreCase(allWords[j]) == 0) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return word;
            }
        }
        return "Нет такого слова.";
    }


    public String[] findWords(String text, String sentenceRegex, String wordRegex) {
        String[] sentences = devideIntoSentences(text, sentenceRegex);
        String[] words = new String[0];
        for (String sentence : sentences) {
            words = mergeArrays(words, devideIntoWords(sentence, wordRegex));
        }
        return words;
    }

    public void printWordsGivenLengthInterrogSent(String text, int length) {
        for (String word : findWords(text, INTERROG_SENTENCES_REGEX, "\\b[а-яА-Я0-9]{" + length + "}\\b")) {
            System.out.println(word);
        }
    }


    public String replaceWords(String text) {
        StringBuilder newText = new StringBuilder();
        for (String sentence : devideIntoSentences(text, ALL_SENTENCES_REGEX)) {
            StringBuilder tempSentence = new StringBuilder(sentence);
            String[] words = devideIntoWords(sentence, ALL_WORDS_REGEX);
            String firstWord = words[0];
            String lastWord = words[words.length - 1];
            tempSentence.replace(0, firstWord.length(), lastWord);
            tempSentence.replace(tempSentence.length() - lastWord.length() - 1, tempSentence.length() - 1, firstWord);
            newText.append(tempSentence);
            newText.append(" ");
        }
        return newText.deleteCharAt(newText.length() - 1).toString();
    }


    public boolean isWordPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String findLongestPalindrome(String text) {
        int maxLength = 0;
        String longestPalindrome = "В тексте нет палиндромов.";
        for (String word : devideIntoWords(text, ALL_WORDS_REGEX)) {
            if (word.length() >= 3 && isWordPalindrome(word) && word.length() > maxLength) {
                longestPalindrome = word;
                maxLength = word.length();
            }
        }
        return longestPalindrome;
    }


    public String removeConsGivenLengthWords(String text, int length) {
        return text.replaceAll("\\b[б-джзй-нп-тф-щБ-ДЖЗЙ-НП-ТФ-Щ][а-я0-9]{" + (length - 1) + "}\\b", "");
    }
}