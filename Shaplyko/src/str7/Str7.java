package str7;

/**
 * 7.	Из текста удалить все слова заданной длины, которые начинаются на согласную букву.
 */
public class Str7 {
    public static void main(String[] args) {
        String str = "Текст из которого удалить все c согласной буквы алава еееее буквы и слова ";
        int wordLength = 5;
        FindWord findWord = new FindWord();
        System.out.print(findWord.separateWord(str, wordLength).toString());
    }
}

