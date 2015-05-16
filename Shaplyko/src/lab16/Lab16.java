package lab16;

/**
 * Задание 16
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */
public class Lab16 {
    public static void main(String[] args) {
        Symbol symbol = new Symbol();
        String str = "Тестовая, строка, с несколькими,, - - ; ; ;; запятыми";
        System.out.println("У нас всего знаков препинаний " + symbol.sumPunctuationMark(str));
    }
}
