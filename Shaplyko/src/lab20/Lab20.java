package lab20;

/**
 * Задание 20
 * Написать программу, выполняющую поиск в строке шестнадцате-ричных чисел, записаных по правилам Java,
 * с помощью регулярных выражений и вывести их на страницу.
 */
public class Lab20 {
    public static void main(String[] args) {
        String str = "ertert ertet -0x7F <p id=p1> 0x7AAF <p id=p1> ergerg eerg eergt   0x1";
        Search search = new Search();
        search.findNumber(str);
    }
}