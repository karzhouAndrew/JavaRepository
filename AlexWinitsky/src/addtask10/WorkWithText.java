package addtask10;

/**
 * 7.Взять любой русскоязычный̆ текст, в котором не меньше трёхсот знаков.
 * Необходимо провести анализ этого текста на:
 * a)	   Количество согласных и гласных букв.
 * b)	   Вывести каждое предложение этого текста в отдельной̆ строке с указанием количества символов в нём.
 * c)	   Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку).
 * d)	   Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его.
 */
public class WorkWithText {
    public static void main(String[] args) {
        String text = "Даниил Квят финишировал в Испании на десятом месте. На старте россиянин провалился с восьмого на тринадцатое место. За один круг до финиша гонщика Red Bull в первом повороте трассы атаковал пилот Toro Rosso Карлос Сайнц. \n" +
                "Болиды столкнулись, но оба смогли продолжить гонку. Тем не менее после инцидента испанец вышел вперед. \n" +
                "Судьи начали расследование случившегося.\n";

        TextFunction textFunctiont = new TextFunction();

        System.out.println("Количсество гласных = " + textFunctiont.calculateVowelNumbers(text));
        System.out.println("Количсество согласных = " + textFunctiont.calculateConsonantsNumbers(text));
        System.out.println("Количсество пробелов, абзацев  = " + textFunctiont.calculateGapNumbers(text));
        System.out.println("Вывод каждого предложения текста в отдельной̆ строке с указанием количества символов " + textFunctiont.printSentence(text));

        System.out.println("Вывод исходного текста без пробелов." + textFunctiont.printTextWithoutGap(text));


    }
}
