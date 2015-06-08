package str7;

public class FindWord {
    public static final char[] VOWEL = "АЕЁИОУЫЭЮЯаеёиоуыэюя".toCharArray();

    public static String separateWord(String str, int wordLength) {
        String[] strArr = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < strArr.length; ++i) {
            char first = strArr[i].charAt(0);
            if (!(strArr[i].length() % wordLength == 0)) {
                newStr.append(strArr[i]).append(" ");
            } else if ((strArr[i].length() % wordLength == 0)) {
                for (int j = 0; j < VOWEL.length; ++j) {
                    if (first == VOWEL[j]) {
                        newStr.append(strArr[i]).append(" ");
                    }
                }
            }
        }
        return newStr.toString();
    }

    public String separateWord2(String str, int wordLength) {
        return str.replaceAll("\\b[БВГДЖЗЙКЛМНПРСТФХЦЧШЩЪЬбвгджзйклмнпрстфхцчшщьъ][а-я0-9]{" +
                (wordLength - 1) + "}\\b", "");
    }
}


