package workGroup;

/**
 * Created by User on 02.05.2015.
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 */
public class HomeWorkNumber4 {
    public static void main(String[] args) {
        float a = 2.3f, b = 3.4f, r = 1.5f;
        System.out.println(a * a + b * b <= 4 * r * r ? "Можно" : "Нельзя");
    }
}
