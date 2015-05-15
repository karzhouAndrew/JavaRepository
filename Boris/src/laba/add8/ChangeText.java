package laba.add8;

//Заменить в строке все вхождения 'child' на 'children'.  Удалить из текста все символы, являющиеся цифрами.
public class ChangeText {

    public static String change(String str) {
        return str.replaceAll("child", "children").replaceAll("Child", "Children").replaceAll("\\d+", "");
    }
}
