package jd02lab07;

/* Задание 7. Напишите программу, которая будет разбирать xml файл, сделанный в предыдущих заданиях с помощью DOM,
и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px */

public class JD02Task07 {
    public static void main(String[] args) {

        final String INPUT_XML_FILE_PATH = "./Dudinsky/src/jd02lab07/pointsList.xml";

        DOMParser domParser = new DOMParser();
        PointsList pointsList = domParser.parseXML(INPUT_XML_FILE_PATH);
        String result = pointsList.arrangeEveryPointPerLineWithUnits();
        System.out.println("Результат разбора XML файла:\n" + result);
    }
}