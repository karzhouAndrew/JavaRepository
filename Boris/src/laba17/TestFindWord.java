package laba17;

// Проверка класса FindWord. Первый метод не отрабатывает пустую строку.
public class TestFindWord {
    public static void main(String[] args) {
        String str = " This   is a  special sentences. Thank  you!  ";
        FindWord sequenceLetter = new FindWord(str);
        System.out.println("Представленая строка для обрабоки на ангийском: " + sequenceLetter.getStr());
        System.out.println("Первый метод. Кол-во слов равно " + sequenceLetter.firstRealization());
        System.out.println("Второй метод. Кол-во слов равно " + sequenceLetter.secondRealization());
    }
}
