package lab4;

//Можно ли закрыть прямоугольник с заданными сторонами окружностью с заданным радиусом
public class Lab4 {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int r = 3;
        if ((Math.sqrt(a * a + b * b) / 2) <= r) {
            System.out.println("Прямоугольник можно закрыть окружностью радиусом " + r);
        } else {
            System.out.println("Прямоугольник нельзя закрыть окружностью радиусом " + r);
        }
    }
}
