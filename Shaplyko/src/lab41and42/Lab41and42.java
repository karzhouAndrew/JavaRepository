package lab41and42;

/**
 * Задание 41
 * Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью DOM, и выводить
 * его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных
 * запятой, при этом должна выводиться единица измерения. Например: 10px, 30px
 * <p/>
 * Задание 42
 * Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью StAX, и выводить
 * его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных
 * запятой, при этом должна выводиться единица измерения. Например: 10px, 30px
 */
public class Lab41and42 {
    public static void main(String[] args) {
        DOMParser domParser = new DOMParser();
        ProcessingPoint pointDomParser = domParser.parseXML("./src/lab37.xml");
        System.out.println(pointDomParser);

        StaxParser staxParser = new StaxParser();
        ProcessingPoint pointStaxParser = staxParser.parseXML("./src/lab37.xml");
        System.out.println(pointStaxParser);
    }
}

