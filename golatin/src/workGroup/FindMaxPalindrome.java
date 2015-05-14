package workGroup;
import java.util.*;

/**
 * Created by NotePad on 14.05.2015.
 */
/*6.	В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом.*/

public final class FindMaxPalindrome {
    public static void printMaxPalindrome(String text) {
        ArrayList palindromes = new ArrayList();
        for (int i = 1; i < text.length() - 1; i++) {
            String tempPalindrome = text.substring(i, i + 1);
            for (int j = 1; j < Math.min(text.length() - i, i); j++) {
                if (text.charAt(i + j) == text.charAt(i - j)) {
                    tempPalindrome = text.charAt(i - j) + tempPalindrome + text.charAt(i + j);
                }
            }
            if (tempPalindrome.length() != 1) {
                palindromes.add(new PairStringInt(tempPalindrome.length(), tempPalindrome));
            }
            tempPalindrome = text.substring(i, i + 2);

            if (tempPalindrome.charAt(0) == tempPalindrome.charAt(1)) {
                for (int j = 1; j < Math.min(text.length() - i - 1, i); j++) {
                    if (text.charAt(i + j + 1) == text.charAt(i - j)) {
                        tempPalindrome = text.charAt(i - j) + tempPalindrome + text.charAt(i + j + 1);

                    }
                }
            }
            if (tempPalindrome.length() != 2 || tempPalindrome.charAt(0) == tempPalindrome.charAt(1)) {
                palindromes.add(new PairStringInt(tempPalindrome.length(), tempPalindrome));
            }
        }
        System.out.println(palindromes);
        printMax(palindromes);
    }

    private static void printMax(ArrayList arrayList) {
        PairStringInt[] tempArray = new PairStringInt[arrayList.size()];
        Arrays.sort(arrayList.toArray(tempArray));
        System.out.println("Максимальный палиндром = " + tempArray[0].getValue());
    }
}
