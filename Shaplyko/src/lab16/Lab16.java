package lab16;

/**
 * Created by Константин on 06.05.2015.
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
        System.out.println("У нас всего знаков препинаний " + (symbol.dash(str)+symbol.semicolon(str)+symbol.colon(str)+symbol.point(str)+symbol.comma(str) ));
    }
}
