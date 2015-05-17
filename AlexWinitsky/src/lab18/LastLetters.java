package lab18;

/**
 * Created by Master on 08.05.2015.
 */
public class LastLetters {

    public String findLastLetters(String str) {
        String newStr = "";
        str = str.trim();
        str = str.replaceAll(" +", " ");
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ' ' || symbol == '.' || symbol == ',' || symbol == '-' || symbol == ':') {
                if (str.charAt(i - 1) != ',' && str.charAt(i - 1) != '.' && str.charAt(i - 1) != ':' && str.charAt(i - 1) != '-') {
                    newStr += str.charAt(i - 1);
                }
            }
        }
        return newStr;
    }

}
