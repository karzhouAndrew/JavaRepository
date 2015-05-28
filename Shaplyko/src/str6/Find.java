package str6;

public class Find {
    public String findMirror(String str) {
        String strWord[] = str.toString().split("[-;:,.!?\\s]");
        int lengthMax = 0;
        String result = null;
        for (int i = 0; i < strWord.length; i++) {
            char[] arrayCharWord = strWord[i].toCharArray();
            int length = 0;
            for (int j = 0; j < arrayCharWord.length / 2; j++) {
                if (arrayCharWord[j] == arrayCharWord[arrayCharWord.length - 1 - j]) {
                    length++;
                }
            }
            if (length == arrayCharWord.length / 2 && length > lengthMax) {
                result = strWord[i];
                lengthMax = length;
            }
        }
        return result;
    }
}






