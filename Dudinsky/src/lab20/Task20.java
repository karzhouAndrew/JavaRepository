package lab20;

/* Задание 20. Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных выражений и вывести их на страницу. */
public class Task20 {
    public static void main(String[] args) {
        String givenStr = "Ox, уж эта (OX!!!) тестовая 0x5fстрока 042715, содержащая 9842105 десятичные, 032517 восьмеричные и 0X52D7A12BE, шестнадцатеричные -0x23ca8; литералы и не только f8b26cd5  -0X5D.";
        NumberCatcher NumberCatcher = new NumberCatcher();
        System.out.println("В строке {\n" + givenStr + "\n} найдены следующие шестнадцатеричные числа:\n" + NumberCatcher.catchAllHexes(givenStr));
    }
}