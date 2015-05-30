package str2;

/**
 * 2.	Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
 */
public class Str2 {
    public static void main(String[] args) {
        String str = " Текст из из которого удалить все c согласной. Буквы буквы еееее! Буквы и  из слова?";
        Sentence sentence = new Sentence();
        sentence.sortingSentence(str);
    }
}


