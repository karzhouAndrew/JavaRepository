package pwt.string;

/**
 * Created by Kirilenko_MV on 06.05.2015.
 * Найти в строке количество знаков препинания.
 */
public class Ex16 {
    public static void main(String[] args) {
        String str = "Тестовая . строка  с ,. несколькими, знаками?! препинания!";
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '!' || symbol == '?') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знаков препинания");
    }
}
