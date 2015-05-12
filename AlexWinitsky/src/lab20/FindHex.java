package lab20;

/**
 ** Задание 20
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java,
 * с помощью регулярных выражений и вывести их на страницу
 */
public class FindHex {
    public static void main(String[] args) {
        String str = "0xF1 шестнадцате-ричных чисел 0x12 0XF2A1";
        RegularExpression regularExpression=new RegularExpression();
        regularExpression.findHex(str);
    }
}
