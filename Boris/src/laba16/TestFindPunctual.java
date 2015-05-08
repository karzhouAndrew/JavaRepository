package laba16;

//Проверка класа по поиску знаков препинания
public class TestFindPunctual {
    public static void main(String[] args) {
        String strTest = "qwe qwe, qw.q 232 :'12312/ '";
        FindPunctuations punctuals = new FindPunctuations(strTest);
        System.out.println("Начальная строка - "+punctuals.getStr());
        System.out.println("Кол-во знаков препинания по первому методу равно "+punctuals.getQuantityPunctual());
        System.out.println("Кол-во знаков препинания по второму методу равно "+punctuals.getQuantityPunctOther());
    }
}
