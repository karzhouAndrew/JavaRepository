package lab20;

/**
 * Написать программу, выполняющую поиск в строке шестнадцате-ричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу.
 */
public class Task {
    public static void main(String[] args) {
        String str = "Some 0X10 string  0xFF1 with hex 0x1a7 numbers";
        CheckString checkString = new CheckString(str);
        checkString.findHex();
    }
}
