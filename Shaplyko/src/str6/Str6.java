package str6;

/**
 * 6.	В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом.
 */
public class Str6 {
    public static void main(String[] args) {
        String str = "Текст из из  которого, удалить шалаш все еще c согласной.Буквы буквы ееее!Буквы и  слова?";
        Find find = new Find();
        System.out.println(find.findMirror(str));
    }
}


