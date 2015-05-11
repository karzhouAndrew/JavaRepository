package laba.add8;

//Проверка класса ChangeText
public class TestChangeText {
    public static void main(String[] args) {
        String strExampple = "Child234 sit in the23 coner. Oth234er old children go ho234me.";
        ChangeText objectExample = new ChangeText(strExampple);
        System.out.println(objectExample.getStr());
        objectExample.change();
        System.out.println(objectExample.getStr());
    }
}
