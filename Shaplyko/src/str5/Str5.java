package str5;

/**
 * 5.  В каждом предложении текста поменять местами первое слово с последним не изменяя длины предложения.
 */
public class Str5 {
    public static void main(String[] args) {
        String str = "Текст из из  которого, удалить все c согласной.Буквы буквы еееее!Буквы и  слова?";
        Replacement replacement = new Replacement();
        System.out.print(replacement.replaceWord(str));
    }
}


