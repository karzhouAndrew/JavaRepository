package lab18;

/* Задание 18. Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов. */
public class Task18 {
    public static void main(String[] args) {
        LetterCatchers letterCatcher = new LetterCatchers();
        String givenStr = "  Строка,  ,-   со знаками пунктуации, а также лишними пробелами  ,!;.  с обеих сторон этих знаков  .  ";
        System.out.println("В строке {\n" + givenStr + "\n} последними буквами слов являются: " + letterCatcher.catchLastLetters(givenStr));
    }
}