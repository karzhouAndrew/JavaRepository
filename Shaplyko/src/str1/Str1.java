package str1;

/**
 * 1.	Найти и вывести предложение из текста, в котором максимальное количество одинаковых слов.
 */
public class Str1 {
        public static void main(String[] args) {
            String str = "Текст из из  которого удалить все c согласной. Буквы буквы буквы еееее! Буквы и  слова? ";
            FindMatches findMatches = new FindMatches();
            System.out.println(findMatches.separateWord(str));
        }
    }



