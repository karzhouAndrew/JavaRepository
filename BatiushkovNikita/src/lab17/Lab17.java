package lab17;

// The number of words in the text

public class Lab17 {
    public static void main(String[] args) {
        String str = "  The String:;       class,, represents. character!? strings. zzuz ";
        System.out.println(WordCounter(str));
    }

    private static int WordCounter(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        int strLength = str.length();
        char symbol;
        int count = 0;
        for (int i = 0; i < strLength; i++) {
            symbol = str.charAt(i);
            if (symbol == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
