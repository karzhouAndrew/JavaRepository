package str4;

public class Find {
    public void interrogativeSentences(String str, int length) {
        String strSentences[] = str.split("[?]");
        for (int i = 0; i < strSentences.length; ++i) {
            String[] strWord = strSentences[i].split(" ");
            for (int j = strWord.length - 1; j >= 0; --j) {
                if (strWord[j].endsWith(".") || strWord[j].endsWith("!")) {
                    break;
                } else if (strWord[j].length() == length) {
                    System.out.println(strWord[j]);
                }
            }
        }
    }
}
