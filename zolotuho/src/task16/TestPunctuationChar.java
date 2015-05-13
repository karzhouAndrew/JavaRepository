package task16;

import java.util.Scanner;

public class TestPunctuationChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String str = new String(sc.nextLine());
        sc.close();
        PunctuationChar punctuation = new PunctuationChar();
        System.out.println("Number of dots : " + punctuation.calculateDots(str));
        System.out.println("Number of commas : " + punctuation.calculateCommas(str));
        System.out.println("Number of colons : " + punctuation.calculateColons(str));
        System.out.println("Number of semicolons : " + punctuation.calculateSemicolons(str));
        System.out.println("Number of exclamations : " + punctuation.calculateExclamations(str));
        System.out.println("Number of question marks : " + punctuation.calculateQuestions(str));
        System.out.println("Number of dashes : " + punctuation.calculateDashes(str));
        int sumPunctuations = punctuation.calculateColons(str) + punctuation.calculateDots(str)
                + punctuation.calculateCommas(str) + punctuation.calculateDashes(str) +
                punctuation.calculateExclamations(str) + punctuation.calculateQuestions(str)
                + punctuation.calculateSemicolons(str);
        System.out.println("Sum of all punctuation marks  : " + sumPunctuations);
    }
}
