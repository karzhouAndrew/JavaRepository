package lab16;

// Find other punctuation marks in string

public class Lab16 {
    public static void main(String[] args) {
        String str = "The String:; class,, represents. character!? strings. ";
        int count = 0;
        int strLength = str.length();
        char symbol;
        for (int i = 0; i < strLength; i++) {
            symbol = str.charAt(i);
            if (symbol == (',') || symbol == '!' || symbol == '?' ||
                    symbol == ';' || symbol == ':' || symbol == '.') {
                count++;
            }
        }
        System.out.println(count);
    }
}

