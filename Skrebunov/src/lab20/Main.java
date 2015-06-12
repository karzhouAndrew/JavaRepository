package lab20;

/*Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java,
с помощью регулярных выражений и вывести их на страницу.
 */
public class Main {
    public static void main(String[] args) {
        RegularExpressions sentence = new RegularExpressions();
        String str = sentence.regular("Программа 0XF0, выполняющую X0A1 поиск в строке шестнадцатеричных 0XB01 чисел");
        System.out.println(str);
    }
}
