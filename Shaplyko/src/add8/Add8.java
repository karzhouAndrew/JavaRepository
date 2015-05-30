package add8;

/**
 * 8.	Заменить в строке все вхождения 'child' на 'children'.
 * Удалить из текста все символы, являющиеся цифрами.
 */
public class Add8 {
    public static void main(String[] args) {
        String str = "child rbrbrt children rtbrbr grbr child rtbt 5456 nt 45646 child";
        Replace replace = new Replace();
        replace.childReplace(str);
        replace.numberReplace(str);
    }
}
