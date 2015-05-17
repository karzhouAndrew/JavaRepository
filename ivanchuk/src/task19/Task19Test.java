package task19;

//Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//другой с помощью StringBuilder и метода append, а третий c помощью StringBuffer и метода append.
//Сравните скорость их выполнения.

public class Task19Test {
    public static void main(String[] args) {
        String text = "Hello world ";
        String world = "helloword";
        StringBuilder textBuilder = new StringBuilder(text);
        StringBuilder worldBuilder = new StringBuilder(world);
        StringBuffer textBuffer = new StringBuffer(text);
        StringBuffer wordBuffer = new StringBuffer(world);
        Long startTime = System.nanoTime();
        Task19.compositionAndString(text, world);
        System.out.println("Оператор сложения и класс String: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        Task19.appendAndStringBuffer(textBuffer, wordBuffer);
        System.out.println("Метод append и класс StringBuffer: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        Task19.appendAndStringBuilder(textBuilder, worldBuilder);
        System.out.println("Метод append и класс StringBuilder: " + (System.nanoTime() - startTime));
    }
}
