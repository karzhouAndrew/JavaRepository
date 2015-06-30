package doplab8ver2;

/*Заменить в строке все вхождения 'child' на 'children'.  Удалить из текста все символы, являющиеся цифрами.
 */
public class Main {
    public static void main(String[] args) {
        Change empty = new Change();
        String result = empty.changeChildren("12 Child, 1783413 Children jsjsdsjdh 77 jjjj 098? Rtvjj 1, - Child");
        System.out.println(result);
    }
}
