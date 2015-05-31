package str6;

public class Find {
    public static final String DIVIDED_PUNCTUATION = "[-;:,.!?\\s]";

    public String findMirror(String str) {
        String strWord[] = str.split(DIVIDED_PUNCTUATION);
        int lengthMax = 0;
        String result = null;
        for (int i = 0; i < strWord.length; i++) {
            if (strWord[i].equals((new StringBuilder(strWord[i])).reverse().toString()) && strWord[i].length() > lengthMax) {
                result = strWord[i];
                lengthMax = strWord[i].length();
            }
        }
        return result;
    }
}






