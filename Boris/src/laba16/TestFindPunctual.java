package laba16;

//Проверка класа по поиску знаков препинания
public class TestFindPunctual {
    public static void main(String[] args) {
        String strTest = "qwe qwe, qw.q 232 :'12312/ '";
        System.out.println("Начальная строка - " + strTest);
        System.out.println("Кол-во знаков препинания по первому методу равно "+FindPunctuations.getQuantityPunctual(strTest));
        System.out.println("Кол-во знаков препинания по второму методу равно "+FindPunctuations.getQuantityPunctualOther(strTest));
    }
}
