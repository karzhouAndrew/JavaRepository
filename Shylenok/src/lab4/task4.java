package lab4;

/**
 * Created by USER on 03.05.2015.
 */
/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.*/
public class task4 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int r = 4;
        if (a * a + b * b <= 4 * r * r) {
            System.out.println("Прямоугольник можно полностью закрыть круглой картонкой радиусом r = " + r);
        } else {
            System.out.println("Прямоугольник нельзя полностью закрыть круглой картонкой радиусом r = " + r);
        }
    }
}

