package lab4;

/**
 * Имеется прямоугольное отверстие размерами А и В. Определить, можно ли его полностью закрыть
 * круглой картонкой радиусом R.
 */
public class Radius {
    public static void main(String[] args) {
        double length1 = 3.0;
        double length2 = 4.0;
        double radius = 2.5;
        double diagonalLength = Math.sqrt(length1 * length1 + length2 + length2);
        if (radius >= diagonalLength / 2) {
            System.out.println("Круглой картонкой закрыть можно");
        } else {
            System.out.println("Круглой картонкой закрыть нельзя");
        }
    }
}
