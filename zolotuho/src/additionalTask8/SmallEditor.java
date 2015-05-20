package additionalTask8;

//Заменить в строке все вхождения 'child' на 'children'.  Удалить из текста все символы, являющиеся цифрами.
public class SmallEditor {
    public String replaceChildToChildren(String string) {
        return string.replaceAll("child[^r]", "children");
    }

    public String deleteDigits(String string) {
        return string.replaceAll("\\d", "");
    }

    public static void main(String[] args) {
        String string = "acv,hd hdvjh 88kj child  child 77 children children";
        SmallEditor smallEditor = new SmallEditor();
        System.out.println("Original text :");
        System.out.println(string);
        System.out.println("Modified text :");
        System.out.println(smallEditor.replaceChildToChildren(string));
        System.out.println(smallEditor.deleteDigits(string));
        System.out.println(smallEditor.deleteDigits(smallEditor.replaceChildToChildren(string)));
    }
}
