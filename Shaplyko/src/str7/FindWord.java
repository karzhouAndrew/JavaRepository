package str7;

public class FindWord {
    public static String separateWord(String str, int wordLength) {
        String[] strArr = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        char[] vowel = "АЕЁИОУЫЭЮЯаеёиоуыэюя".toCharArray();
        for (int i = 0; i < strArr.length; ++i) {
            char first = strArr[i].charAt(0);
            if (!(strArr[i].length() % wordLength == 0)) {
                newStr.append(strArr[i]).append(" ");
            } else if ((strArr[i].length() % wordLength == 0)) {
                for (int j = 0; j < vowel.length; ++j) {
                    if (first == vowel[j]) {
                        newStr.append(strArr[i]).append(" ");
                    }
                }
            }
        }
        return (newStr.toString());
    }
}


