package lab16;

/**
 * Задание 16
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */
public class Lab16 {
    public static void main(String[] args) {
        Symbol symbol = new Symbol();
        String str = "Тестовая, строка, с несколькими,, - - ; ; ;; запятыми";
        System.out.println("У нас есть " + symbol.comma(str) + " запятых");
        System.out.println("У нас есть " + symbol.point(str) + " точек");
        System.out.println("У нас есть " + symbol.colon(str) + " двоеточий");
        System.out.println("У нас есть " + symbol.semicolon(str) + " точек с запятой");
        System.out.println("У нас есть " + symbol.dash(str) + " тире");
        int sum = symbol.dash(str) + symbol.semicolon(str) + symbol.colon(str) + symbol.point(str) + symbol.comma(str);
        System.out.println("У нас всего знаков препинаний " + sum);
    }
}
