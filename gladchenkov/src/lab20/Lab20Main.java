package lab20;

/**
 * Написать программу, выполняющую поиск в строке шестнадцате-ричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу.
 */
public class Lab20Main {
    public static void main(String[] args) {
        Lab20 lab = new Lab20();
        lab.SearchNumbers("0x66 Просто 0x78текст 0xAB  содержащий 0x15");
    }
}