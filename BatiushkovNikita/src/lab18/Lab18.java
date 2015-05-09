package lab18;

// String with the last letter of a words

public class Lab18 {
    public static void main(String[] args) {
        String str = "thE StrinG clasS representS characteR";
        int strLength = str.length();
        char symbol;
        String subStr = "";
        for (int i = 0; i < strLength; i++) {
            symbol = str.charAt(i);
            if (symbol == ' ') {
                subStr += str.charAt(i - 1);
            }
        }
        System.out.println(subStr);
    }
}
