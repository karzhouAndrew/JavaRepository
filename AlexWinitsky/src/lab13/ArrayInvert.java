package lab13;

/**
  Задание 13
 * Создать массив, заполнить его случайными элементами, распеча-тать, перевернуть, и снова распечатать (при переворачивании нежела-тельно создавать еще один массив).
 */
public class ArrayInvert {
    public static void main(String[] args) {
        int myarray[] = new int[6];

        System.out.println("Исходный массив ");
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = (int) (10 * Math.random());
            System.out.print(myarray[i]);

        }

        for (int i = 0; i < myarray.length / 2; i++) {
            int first = myarray[i];
            int last = myarray[myarray.length - i - 1];
            myarray[i] = last;
            myarray[myarray.length - i - 1] = first;

        }
        System.out.println("");
        System.out.println("Перевернутый массив ");
        for (int i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i]);
        }

    }
}

