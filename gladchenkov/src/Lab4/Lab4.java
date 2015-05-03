package Lab4;

/**Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 *
 */
public class Lab4 {
    public static void main(String[] args) {
        int a = 40;
        int b = 100;
        int c = (int) Math.sqrt(a * a + b * b); //диагональ прямоугольника
        int r = 200;

        if (r >= c) {
            System.out.printf("Отверстие можно закрыть картонкой ридиуса = " + r);
        } else {
            System.out.printf("Отверстие нельзя закрыть картонкой ридиуса = " + r);
        }
    }
}
