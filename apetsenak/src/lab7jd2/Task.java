package lab7jd2;

/**
 * Напишите программу, которая будет разбирать xml файл,
 * сделанный в предыдущих заданиях с помощью DOM,
 * и выводить его на экран в текстовом виде.
 * Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться единица измерения.
 * Например: 10px, 30px
 */
public class Task {
    public static void main(String[] args) {
        DOMParser parser = new DOMParser();
        PointsList pointsList = parser.parseXML("./apetsenak/src/lab7jd2/point.xml");
        System.out.println(pointsList);
    }
}
