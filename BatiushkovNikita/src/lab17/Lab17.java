package lab17;

// The number of words in the text

public class Lab17 {
    public static void main(String[] args) {
        String str = "  The String:;       class,, represents. character!? strings. zzuz ";
        System.out.println(getNumberOfWords(str));
    }

    private static int getNumberOfWords(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        int strLength = str.length();
        int count = 0;
        for (int i = 0; i < strLength; i++) {
            char symbol = str.charAt(i);
            if (symbol == ' ') {
                count++;
            }
        }
        return count + 1;
    }
}
