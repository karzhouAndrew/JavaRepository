package addLab7;

/**
 * Взять любой русскоязычный̆ текст, в котором не меньше трёхсот знаков.
 * Необходимо провести анализ этого текста на:
 * a)	   Количество согласных и гласных букв.
 * b)	   Вывести каждое предложение этого текста в отдельной̆ строке с указанием количества символов в нём.
 * c)	   Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку).
 * d)	   Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его.
 */
public class Task {
    public static void main(String[] args) {
        String text = "Лету нужно время, чтобы разгореться. " +
                "Впереди еще долгие жаркие, знойные и просто теплые приятные деньки, когда солнце просыпается рано, " +
                "а заходит очень не скоро, давая вволю нагуляться, прежде чем погрузиться в сумерки. " +
                "\nА вот и солнце начинает припекать, наступают жаркие дни. Зелень вовсю цветет, одаривая съедобными травами. " +
                "Небосклон голубой и чистый, время от времени проплывают по нему пушистые облака. " +
                "Прогретый воздух источает аромат цветения.";
        System.out.println(text.length());
        TextEditor textEditor = new TextEditor();
        System.out.println("Количество согласных - " + textEditor.findConsonantAmount(text));
        System.out.println("Количество гласных - " + textEditor.findVowelAmount(text));
        System.out.println("Количество пробелов - " + textEditor.findSpaceAmount(text));
        System.out.println("Количество абзацев - " + textEditor.findIndentAmount(text));
        System.out.println("Вывод предложений текста: ");
        textEditor.printSentences(text);
        System.out.println();
        String noSpaces=textEditor.textWithoutSpaces(text);
        System.out.println("Вывод текста без пробелов: ");
        System.out.println(noSpaces);
    }
}
