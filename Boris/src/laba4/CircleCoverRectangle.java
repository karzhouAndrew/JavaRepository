package laba4;

//There is a rectangle outlet with 'a' and 'b' side. Is the circle with radius 'r' a piece of cardboard full covering
// the outlet?
public class CircleCoverRectangle {
    public static void main(String[] args) {
        int radius = 5;
        int sideA = 6;
        int sideB = 8;
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) > Math.pow(2 * radius, 2)) {
            System.out.printf("Круг с радиусом %d не закрывает полностью прямоугольник со сторонами %d и %d",
                    radius, sideA, sideB);
        } else {
            System.out.printf("Круг с радиусом %d полностью закрывает прямоугольник со сторонами %d и %d",
                    radius, sideA, sideB);
        }
    }
}
