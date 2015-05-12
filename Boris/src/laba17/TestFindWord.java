package laba17;

// Проверка класса FindWord. Первый метод не отрабатывает пустую строку.
public class TestFindWord {
    public static void main(String[] args) {
        String strTest = " This   is a  special sentences. Thank  you!  ";
        System.out.println("Представленая строка для обрабоки на ангийском: " + strTest);
        System.out.println("Первый метод. Кол-во слов равно " + FindWord.firstRealization(strTest));
        System.out.println("Второй метод. Кол-во слов равно " + FindWord.secondRealization(strTest));
    }
}
