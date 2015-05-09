package lab16;

// Find other punctuation marks in string

public class Lab16 {
    public static void main(String[] args) {
        String str = "The String:; class,, represents. character!? strings. ";
        System.out.println(punctMarksCounter(str));
    }

    private static int punctMarksCounter(String str) {
        int count = 0;
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            char symbol = str.charAt(i);
            if (symbol == (',') || symbol == '!' || symbol == '?' ||
                    symbol == ';' || symbol == ':' || symbol == '.') {
                count++;
            }
        }
        return count;
    }
}

