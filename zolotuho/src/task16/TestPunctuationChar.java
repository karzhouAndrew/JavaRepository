package task16;

import java.util.Scanner;

public class TestPunctuationChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = new String(sc.nextLine());
        sc.close();
        PunctuationChar punctuation = new PunctuationChar();
        System.out.println("Number of punctuation marks: " + punctuation.calculatePunctuationMarks(str));
    }
}
