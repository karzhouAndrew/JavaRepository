package lab18;

/**
 * Created by Master on 08.05.2015.
 */
public class LastLetters {
    private String str;

    LastLetters(String str) {
        this.str = str;
    }

    String findLastLetters() {
        String newstr = "";
        char symbol;
        str = str.trim();
        str = str.replaceAll(" +", " ");
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ' ' || symbol == '.' || symbol == ',' || symbol == '-' || symbol == ':') {
                if (str.charAt(i - 1) == ',' || str.charAt(i - 1) == '.' || str.charAt(i - 1) == ':' || str.charAt(i - 1) == '-') {
                } else {
                    newstr += str.charAt(i - 1);
                }
            }
        }
        return newstr;
    }

}
