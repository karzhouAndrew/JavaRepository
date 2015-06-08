package lab14;

/*Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */
public class Main {
    public static void main(String[] args) {
        int mass[] = new int[5];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        int sum = 0;
        for (int i = 1; i <= mass.length - 2; i++) {
            sum += mass[i];
        }
        System.out.println();
        System.out.println("Сумма элементов " + sum);
    }
}
