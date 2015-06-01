package dopLab7;

/**
 * Необходимо провести анализ этого текста на:
 * a)	   Количество согласных и гласных букв.
 * b)	   Вывести каждое предложение этого текста в отдельной̆ строке с указанием количества символов в нём.
 * c)	   Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку).
 * d)	   Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его
 */

public class DopLab7Main {
    public static void main(String[] args) {
        String text = "Apple заинтересована в покупке канадского производителя мобильных устройств BlackBerry." +
                " Сообщает Yahoo! Finance со ссылкой на публикацию аналитической компании Zacks Equity Research. " +
                "\n Как уточняет источник, Apple нацелена в первую очередь на портфель из 44 тыс. патентов в сфере " +
                "корпоративной безопасности. А так же защиты данных и беспроводных технологий";

        DopLab7 dopLab7 = new DopLab7();
        System.out.println("Количество гласных в тексте = " + dopLab7.numberConsonants(text));
        System.out.println("Количество согласных в тексте = " + dopLab7.numberVowels(text));
        System.out.println("Количество пробелов в тексте = " + dopLab7.numberSpaces(text));
        System.out.println("Количество абзацев в тексте = " + dopLab7.numberParagraphs(text));
        System.out.println("Текст без пробелов = " + dopLab7.withoutSpaces(text));

        dopLab7.numberSentences(text);

    }
}
