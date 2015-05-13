package str1;

/**
 * Created by Константин on 13.05.2015.
 */
public class FindMatches {
    public String separateWord(String str) {
        String strSentences[] = str.toString().split("[.!?]");
        int arrayIndexSentences[] = new int[strSentences.length];
        for (int i = 0; i < strSentences.length; ++i) {
            int numberMatches = 0;
            String[] strArr = strSentences[i].split(" ");
            for (int j = 0; j < strArr.length; ++j) {
                for (int k = 0; k < strArr.length; ++k) {
                    if (strArr[j].equalsIgnoreCase(strArr[k])) {
                        numberMatches++;
                    }
                }
            }
            arrayIndexSentences[i] = numberMatches - strArr.length;
        }
        int max = arrayIndexSentences[0];
        int maxInd = 0;
        for (int i = 0; i < arrayIndexSentences.length; ++i) {
            if (arrayIndexSentences[i] > max) {
                max = arrayIndexSentences[i];
                maxInd = i;
            }
        }
        return strSentences[maxInd];
    }
}



