package work.laba6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6.	В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом (из нескольких слов).
public class FindPalindrome {
    private static final Pattern PATTERN_SENTENCE = Pattern.compile("[A-ZА-Я0-9][^.?!]+[.?!]+");

    public static String findMaxPalindrome(String str) {
        Matcher matcher = PATTERN_SENTENCE.matcher(str);
        StringBuilder maxPalindrome = new StringBuilder();
        while (matcher.find()) {
            String sentence = matcher.group();
            String palindrome = palindromeInSentence(sentence);
            if (maxPalindrome.length() < palindrome.length()) {
                maxPalindrome.delete(0, maxPalindrome.length()).append(palindrome);
            } else if (maxPalindrome.length() == palindrome.length()) {
                maxPalindrome.append("\n").append(palindrome);
            }
        }
        return maxPalindrome.toString();
    }

    private static String palindromeInSentence(String sentence) {
        String maxPalindromeInSentence = "";
        sentence = sentence.replaceAll("[\\p{Punct}\\p{Blank}]+", " ").trim();
        boolean isPalindromeFound = false;
        while (!sentence.isEmpty()) {
            String searchingSentence = sentence;
            while (!searchingSentence.isEmpty()) {
                String sequenceOfLiterals = searchingSentence.replaceAll("\\p{Blank}+", "").toLowerCase();
                if (isItPalindrome(sequenceOfLiterals)) {
                    maxPalindromeInSentence = takeMaxFromTwo(maxPalindromeInSentence, searchingSentence);
                    isPalindromeFound = true;
                    break;
                }
                searchingSentence = removeLastWord(searchingSentence);
            }
            sentence = removeFirstWord(sentence);
            if (isPalindromeFound &&
                    isMaxPalindromeLargerRemainingSentence(sentence, maxPalindromeInSentence)) {
                return maxPalindromeInSentence;
            }
        }
        return maxPalindromeInSentence;
    }

    private static boolean isMaxPalindromeLargerRemainingSentence(String sentence, String maxPalindromeInSentence) {
        return maxPalindromeInSentence.replaceAll("\\p{Blank}+", "").length() > sentence.replaceAll("\\p{Blank}+", "").length();
    }

    private static String removeLastWord(String sentence) {
        String[] arrayWord = sentence.split(" ");
        return removeWord(arrayWord, arrayWord.length - 1);
    }

    private static String removeWord(String[] arrayWord, int wordNumber) {
        StringBuilder sentenceRemoveLastWord = new StringBuilder();
        if (arrayWord.length == 1) {
            return "";
        } else {
            for (int i = 0; i < arrayWord.length; i++) {
                if (i != wordNumber) {
                    sentenceRemoveLastWord.append(arrayWord[i]).append(" ");
                }
            }
            return sentenceRemoveLastWord.toString().trim();
        }
    }

    private static String removeFirstWord(String sentence) {
        return removeWord(sentence.split(" "), 0);
    }


    private static String takeMaxFromTwo(String maxPalindrome, String palindrome) {
        if (maxPalindrome.length() < palindrome.length()) {
            return palindrome;
        } else {
            return maxPalindrome;
        }
    }

    private static boolean isItPalindrome(String word) {
        int startIndex = 0;
        while (startIndex < word.length() / 2.0) {
            if (word.charAt(startIndex) != word.charAt(word.length() - 1 - startIndex)) {
                return false;
            }
            startIndex++;
        }
        return true;
    }
}
