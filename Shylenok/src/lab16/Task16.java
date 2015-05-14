package lab16;

/**
 * Created by USER on 13.05.2015.
 Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.*/
public class Task16 {
    public static void main(String[] args) {
        String str = "Тестовая!!!, строка, с несколькими,, запятыми и не только.........";
        int sum = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.'|| symbol == '!') {
                sum++;
            }
        }
        System.out.println("У нас есть " + sum + " знаков припинания");
    }
}
