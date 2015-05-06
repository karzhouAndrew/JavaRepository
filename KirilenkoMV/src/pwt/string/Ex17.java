package pwt.string;

/**
 * Created by Kirilenko_MV on 06.05.2015.
 * Найти количество слов в строке.
 */
public class Ex17 {
    public static void main(String[] args) {
        String str = " Эта строка   состоит из нескольких  слов  и кучи пробелов  ";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol != ' ') {
                i = str.indexOf(' ', i);
                counter++;
            }
        }
        System.out.println("Количество слов = " + counter);
    }
}
