package lab18;

/**
 * Задание 18
 * Имеется строка с текстом. Вывести текст, составленный из послед-них букв всех слов.
 */
public class Lab18 {
    public static void main(String[] args) {
        Symbol symbol = new Symbol();
        String str = "  строка  со    несколькими    запятыми    или       ";
        symbol.word(str);
    }
}
