package str3;

public class Find {
    public void findWordSentences(String str) {
        String strSentences[] = str.toString().split("[.!?]");
        String[] strWord0 = strSentences[0].split(" ");
        for (int i = 0; i < strWord0.length; ++i) {
            int counter = 0;
            for (int j = 1; j < strSentences.length; ++j) {
                String[] strWord = strSentences[j].split(" ");
                for (int k = 0; k < strWord.length; ++k) {
                    if (strWord[k].equalsIgnoreCase(strWord0[i])) {
                        counter++;
                    }
                }
            }
            if (counter == 0) {
                System.out.println("Такого слова нет ни в одном предложении: " + strWord0[i]);
            }
        }
    }
}


