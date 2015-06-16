package str2;

public class Sentence {
    public void sortingSentence(String str) {
        String strSentences[] = str.split("[.!?]");
        int arrayIndexSentences[] = new int[strSentences.length];
        for (int i = 0; i < strSentences.length; ++i) {
            arrayIndexSentences[i] = strSentences[i].split(" ").length;
        }
        for (int j = 0; j < arrayIndexSentences.length; j++) {
            int indexNumber = j;
            for (int i = j + 1; i < arrayIndexSentences.length; i++) {
                if (arrayIndexSentences[i] <= arrayIndexSentences[indexNumber]) {
                    indexNumber = i;
                }
            }
            int minNumber = arrayIndexSentences[j];
            arrayIndexSentences[j] = arrayIndexSentences[indexNumber];
            arrayIndexSentences[indexNumber] = minNumber;
        }
        for (int i = 0; i < arrayIndexSentences.length; i++) {
            for (int j = 0; j < strSentences.length; j++) {
                if (arrayIndexSentences[i] == strSentences[j].split(" ").length) {
                    System.out.println(strSentences[j]);
                }
            }
        }
    }
}



