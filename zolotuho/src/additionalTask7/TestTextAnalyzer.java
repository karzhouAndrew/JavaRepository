package additionalTask7;


public class TestTextAnalyzer {
    public static void main(String[] args) {
        String string="Необходимо провести анализ этого текста на: \n" +
                "  Количество согласных и гласных букв. \u2028\n" +
                "  Вывести каждое предложение этого текста в отдельной̆ строке с указанием количества символов в нём. \u2028\n" +
                "  Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку). \u2028\n" +
                "    Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его. \u2028\n";
        System.out.println(string);
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        textAnalyzer.showSentencesWithSymbolCounter(string);
        System.out.println("Number of consonants " + textAnalyzer.countConsonants(string));
        System.out.println("Number of vowels " + textAnalyzer.countVowels(string));
        System.out.println("Number of spaces " + textAnalyzer.countSpaces(string));
        System.out.println("Number of paragraphs " + textAnalyzer.countParagraphs(string));
        System.out.println("Text w/o spaces");
        System.out.println(textAnalyzer.obtainTextWithoutSpaces(string));
    }
}
