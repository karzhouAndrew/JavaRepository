package str4;

/**
 * 4.	Во всех вопросительных предложениях текста найти и напечатать слова заданной длины.
 */
public class Str4 {
    public static void main(String[] args) {
        String str = "Текст из которогооо удалить все c согласно? Идууу в школу. Буквы буквы еееее! Буквы и  слова? ";
        int length = 3;
        Find find = new Find();
        find.interrogativeSentences(str, length);
    }
}



