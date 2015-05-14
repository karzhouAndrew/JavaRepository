package str3;

/**
 * 3.	Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.
 */
public class Str3 {
    public static void main(String[] args) {
        String str = " Текст слова буквы. Буквы буквы еееее! Буквы и  из слова?";
        Find find = new Find();
        find.findWordSentences(str);
    }
}


