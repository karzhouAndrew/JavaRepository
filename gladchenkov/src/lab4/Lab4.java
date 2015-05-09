package lab4;

/**Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 *
 */
public class Lab4 {
    public static void main(String[] args) {
        int firstSide = 40;
        int secondSide = 100;
        int diagonal = (int) Math.sqrt(firstSide * firstSide + secondSide * secondSide);
        int radius = 200;

        if (radius >= diagonal) {
            System.out.printf("Отверстие можно закрыть картонкой ридиуса = " + radius);
        } else {
            System.out.printf("Отверстие нельзя закрыть картонкой ридиуса = " + radius);
        }
    }
}
