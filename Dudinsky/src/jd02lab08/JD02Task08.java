package jd02lab08;

/* Задание 8. Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью StAX,
и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px */

public class JD02Task08 {

    private static final String INPUT_XML_FILE_PATH = "./Dudinsky/src/jd02lab08/pointsList.xml";

    public static void main(String[] args) {

        STAXParser staxParser = new STAXParser();
        PointsList pointsList = staxParser.parseXML(INPUT_XML_FILE_PATH);
        String result = pointsList.arrangeEveryPointPerLineWithUnits();
        System.out.println("Результат разбора XML файла:\n" + result);
    }
}