package lab31;

/**
 * Задание 31
 * Имеется файл с текстом, в котором присутствуют числа.
 * Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.
 */
public class RunFindNumberInText {
    public static void main(String[] args) {
        String path = "./AlexWinitsky/src/lab31/Text.txt";
        FindNumberInText findNumberInText = new FindNumberInText();
        findNumberInText.findNumber(findNumberInText.readFile(path));

    }
}
