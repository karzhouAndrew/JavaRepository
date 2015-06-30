package stringTask6;

//В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом.
public class PalindromeFinder {
    public String[] splitToWords(String string) {
        return string.split("[ ,;:?!.]+");
    }

    public boolean checkPalindrome(String word) {
        boolean isPalindrome = false;
        int equalSymbolCounter = 0;
        for (int j = 0; j < word.length() / 2; j++) {
            if (word.charAt(j) == word.charAt(word.length() - 1 - j)) {
                equalSymbolCounter++;
            }
        }
        if (equalSymbolCounter == word.length() / 2) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public String findPalindromes(String string) {
        String[] words = splitToWords(string);
        boolean presencePalindrome = false;
        int[] lengthPalindromeWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (checkPalindrome(words[i])) {
                lengthPalindromeWords[i] = words[i].length();
                presencePalindrome = true;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (presencePalindrome) {
            int max = lengthPalindromeWords[0];
            for (int i = 1; i < lengthPalindromeWords.length; i++) {
                if (max < lengthPalindromeWords[i]) {
                    max = lengthPalindromeWords[i];
                }
            }
            for (int i = 0; i < lengthPalindromeWords.length; i++) {
                if (lengthPalindromeWords[i] == max) {
                    stringBuilder.append(words[i]);
                    stringBuilder.append(" ");
                }
            }
            return stringBuilder.toString();
        } else {
            return "Palindrome is not found";
        }
    }
}
