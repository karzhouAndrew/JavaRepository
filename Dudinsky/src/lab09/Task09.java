package lab09;

/* Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них. */
public class Task09 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 20);
        int maxX = x;
        System.out.println("Последовательность случайных чисел от 0 до 19 (генерируется пока не попадется нуль):");
        System.out.print(x + " ");
        while (x != 0) {
            x = (int) (Math.random() * 20);
            System.out.print(x + " ");
            if (x > maxX) {
                maxX = x;
            }
        }
        System.out.println();
        System.out.println("Наибольшее число в последовательности: " + maxX);
    }
}