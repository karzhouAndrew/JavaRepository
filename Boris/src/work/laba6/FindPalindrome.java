package work.laba6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6.	В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом.
public class FindPalindrome {
    private static final Pattern PATTERN_SENTENCE = Pattern.compile("[A-ZА-Я0-9][^.?!]+[.?!]+");

    public static String findPalindrome(String str) {
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
        int startIndex = 0;
        int endIndex = sentence.length() - 1;
        String maxPalindrome = new String();
        //Если не учитывать знаки препинания, можно сравниваит буквы из массива слов.
        //Сделать реализацию  через отрезание слов от предложения!!!
        while (startIndex < sentence.length()) {
            if ()
            while (endIndex > startIndex) {
                if (sentence.toLowerCase().charAt(startIndex) == sentence.toLowerCase().charAt(endIndex)) {
                    String sentenceForEquals = sentence.substring(startIndex,endIndex).toLowerCase();
                    if (isItPalindrome(sentenceForEquals)) {
                        String palindrome = pickUpPalindrome(sentence, startIndex, endIndex).toString();
                        maxPalindrome = takeMaxPalindrome(maxPalindrome,palindrome);
                    }
                }
                endIndex--;
            }
            startIndex++;
        }
        return maxPalindrome;
    }

    private static String takeMaxPalindrome(String maxPalindrome, String palindrome) {
        if (maxPalindrome.length() < palindrome.length()){
            return palindrome;
        }else {
            return maxPalindrome;
        }
    }

    private static StringBuilder pickUpPalindrome(String sentence, int startIndex, int endIndex) {
        StringBuilder palindrome = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            palindrome.append(sentence.charAt(i));
        }
        return palindrome;
    }

    private static boolean isItPalindrome(String sentence) {
        int startIndex = 0;
        while (startIndex < sentence.length()) {
            if (sentence.charAt(startIndex) != sentence.charAt(sentence.length()-1-startIndex)) {
                return false;
            }
            startIndex++;
        }
        return true;
    }
}
