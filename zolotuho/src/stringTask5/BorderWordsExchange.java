package stringTask5;

//В каждом предложении текста поменять местами первоеслово с последним не изменяя длины предложения.
public class BorderWordsExchange {

    public String[] splitToSentences(String string) {
        return string.split("[!.?]");
    }

    public String[] splitBySpaces(String string) {
        return string.split("[ ]");
    }

    public String exchangeWordsInSentence(String string) {
        String[] splatSpacesString = splitBySpaces(string);
        StringBuilder stringBuilder = new StringBuilder();
        int sentenceCursor = 0;
        int wordCounterInSentence = 0;
        int indexFirstWord = 0;
        char firstWordPunctuation = 0;
        boolean firstWordInSentence = false;

        for (int i = 0; i < splatSpacesString.length; i++) {
            wordCounterInSentence++;
            if (splatSpacesString[i].isEmpty() == false && firstWordInSentence == false) {
                firstWordInSentence = true;
                indexFirstWord = i;
                firstWordPunctuation = splatSpacesString[i].charAt(splatSpacesString[i].length() - 1);
            }
            if (splatSpacesString[i].matches(".+[?!.]")) {
                char sentencePunctuation = splatSpacesString[i].charAt(splatSpacesString[i].length() - 1);
                for (int j = sentenceCursor; j <= i; j++) {
                    if (j == indexFirstWord && wordCounterInSentence > 1) {
                        stringBuilder.append(splatSpacesString[i].substring(0, splatSpacesString[i].length() - 1));
                        if (splatSpacesString[indexFirstWord].matches(".+[:;,]")) {
                            stringBuilder.append(firstWordPunctuation);
                        }
                        stringBuilder.append(" ");
                    } else if (j == i && wordCounterInSentence > 1) {
                        if (splatSpacesString[indexFirstWord].matches(".+[:;,]")) {
                            stringBuilder.append(splatSpacesString[indexFirstWord].substring(0, splatSpacesString[indexFirstWord].length() - 1));
                        } else {
                            stringBuilder.append(splatSpacesString[indexFirstWord].substring(0, splatSpacesString[indexFirstWord].length()));
                        }
                        stringBuilder.append(sentencePunctuation);
                        stringBuilder.append(" ");
                    } else if (splatSpacesString[j].isEmpty()) {
                        stringBuilder.append(" ");
                    } else {
                        stringBuilder.append(splatSpacesString[j]);
                        stringBuilder.append(" ");
                    }
                }
                sentenceCursor = i + 1;
                firstWordInSentence = false;
                firstWordPunctuation = 0;
                wordCounterInSentence = 0;
            }
        }
        return stringBuilder.toString();
    }
}
