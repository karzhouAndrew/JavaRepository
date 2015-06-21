package lab41;

/**
 Задание 8
 Напишите программу, которая будет разбирать xml файл, сделан-ный в предыдущих заданиях с помощью StAX,
 и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 разделенных запятой, при этом должна выводиться еди-ница измерения. Например: 10px, 30px

 */
public class RunStAXParser {
    public static void main(String[] args) {
        StAXParser parser = new StAXParser();
        parser.printCoordinates(parser.createStAXparser());

    }
}
