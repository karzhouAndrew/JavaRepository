package laba.add7;

//Проверка класса TextAnalysis

public class TestTextAnalysis {
    public static void main(String[] args) {
        String strExample = "Водитель против ментов\n" +
                "Случилось это со мной совсем недавно, поэтому точное место указывать не буду. Возвращался " +
                "я домой из гостей на своей машине, остановили меня гаишники за превышение скорости на 11 км/час: " +
                "ехал я 51 км/час, вместо положенных 40. Про себя думаю: «как они достали, эти нахалы с тремя " +
                "классами образования», надо как-нибудь выкрутится. Далее передаю дословно диалог, который " +
                "состоялся между нами.\n" +
                "– Сержант такой-то, Ваши документы.\n" +
                "– А ваши?\n" +
                "Показывает. Предъявляю ему свои.\n" +
                "– Вы превысили скорость.\n" +
                "– Я не превышал.\n" +
                "Показывает прибор.\n" +
                "– Разрешение на прибор есть? – спрашиваю я.\n" +
                "– Есть.\n" +
                "– Предъявите, пожалуйста.\n" +
                "Невероятно злой мент показывает мне ксерокопию какой-то странной бумаги. Я, делая удивленное " +
                "лицо, спрашиваю:\n" +
                "– Что это?\n" +
                "– Разрешение на использование данного прибора до 10.08.08.\n" +
                "– А если я буду ездить с ксерокопией прав или техпаспорта, как вы думаете, далеко я уеду?\n" +
                "\n" +
                "Последовал отрицательный ответ. Тут в «разговор» вмешиваются два других мента — начинают меня " +
                "трамбовать. В течение 10 минут они пытались убедить меня в своей правоте, но устали и отпустили. " +
                "Еду дальше, счастливый и уверенный в себе, довольный тем, что наглее трех ментов (и ведь, главное, " +
                "все законно). Смело давлю на педаль. Еду со скоростью 90 км/час по населенному пункту (к тому времени " +
                "уже находился в другом районе края). Вырастает как из-под земли очередной мент и с улыбочкой " +
                "предлагает пройти в его машину. Сажусь, вижу радар с ноутбуком, мне показывают видеосъемку. " +
                "Я, ничуть не смущаясь, нагло спрашиваю о разрешении на эксплуатацию прибора.\n" +
                "\n" +
                "Милиционер отвечает:\n" +
                "– Имеется!\n" +
                "– Предъявите, – требую я.\n" +
                "Он достает и показывает — оригинал, между прочим.\n" +
                "– Да, думаю, попал... На 30 км/час. Это дорого.\n" +
                "Тут меня осенило:\n" +
                "– А программное обеспечение для ноутбука у вас лицензионное?\n" +
                "– ???\n" +
                "Озадаченный мент молча отдал мне документы. Уже через час я был дома.";

        System.out.println("Кол-во согласных букв равно " + TextAnalysis.quantityConsonant(strExample));
        System.out.println("Кол-во гласных букв равно " + TextAnalysis.quantityVowel(strExample));
        System.out.println("Кол-во пробелов равно " + TextAnalysis.quantitySpace(strExample));
        System.out.println("Кол-во абзацев равно " + TextAnalysis.quantityIndent(strExample));
        TextAnalysis.separateSentence(strExample);
        TextAnalysis.textWithoutSpace(strExample);
    }
}