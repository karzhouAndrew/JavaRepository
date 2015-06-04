package task19;

//Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//другой с помощью StringBuilder и метода append, а третий c помощью StringBuffer и метода append.
//Сравните скорость их выполнения.

public class Task19Test {
    public static void main(String[] args) {
        String stringText = "Hello world ";
        String word = "helloworld";
        StringBuilder builderText = new StringBuilder(stringText);
        StringBuffer bufferText = new StringBuffer(stringText);
        Long startTime = System.nanoTime();
        Task19.stringCompose(stringText, word);
        System.out.println("Оператор сложения и класс String: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        Task19.stringBufferAppend(bufferText, word);
        System.out.println("Метод append и класс StringBuffer: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        Task19.stringBuilderAppend(builderText, word);
        System.out.println("Метод append и класс StringBuilder: " + (System.nanoTime() - startTime));
    }
}
