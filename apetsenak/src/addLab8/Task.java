package addLab8;

/**
 * Заменить в строке все вхождения 'child' на 'children'.
 * Удалить из текста все символы, являющиеся цифрами.
 */
public class Task {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        String text = "child childr 8 899child485 achild ,child, 345 children";
        System.out.println(text);
        System.out.println("После удаления цифр : ");
        text = textEditor.delDigits(text);
        System.out.println(text + "\n");
        System.out.println("Заменяем вхождения 'child' на 'children' : ");
        System.out.println(textEditor.replaceWords(text));
    }
}
