package lab21;

/**
 * Написать программу, выполняющую поиск в строке всех тегов абза-цев,
 * в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */
public class Task {
    public static void main(String[] args) {
        String text = "<p style=\"font-size:9px\">Текст высотой 9 пикселей</p> Как-то так <P ><blockquote>Отступ слева</blockquote></p>";
        TextFormat textFormat = new TextFormat();
        System.out.println("Исходная строка : ");
        System.out.println(text);
        System.out.println("После форматирования : ");
        System.out.println(textFormat.replaceTag(text));
    }
}
