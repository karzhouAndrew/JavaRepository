package lab19;

/**
 * Напишите два цикла выполняющих многократное сложение строк,
 * один с помощью оператора сложения и String,
 * а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 */
public class Task {
    public static void main(String[] args) {
        String concatWithString = "String - ";
        StringBuilder concatWithStringBuilder = new StringBuilder("String - ");
        long startTimeString = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            concatWithString += "add";
        }
        long estimatedTimeString = System.nanoTime() - startTimeString;
        long startTimeStringBuilder = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            concatWithStringBuilder.append("add");
        }
        long estimatedTimeStringBuilder = System.nanoTime() - startTimeStringBuilder;
        System.out.println("estimatedTimeString = " + estimatedTimeString);
        System.out.println("estimatedTimeStringBuilder = " + estimatedTimeStringBuilder);
    }
}
