package lab21;
/**
 *Задание 21
 * Написать программу, выполняющую поиск в строке всех тегов абзацев,
 * в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */
public class RunFindTegP {
    public static void main(String[] args) {
        String str = " Написать программу <p   id=p1> выполняющую поиск в строке всех тегов <p class=main>  на простые теги абзацев <p> ";
        System.out.println("Исходная строка "+str);

        FindTegP findTegP=new FindTegP();
        System.out.println(findTegP.findTeg(str));
    }
}
