package lab16dop;

/**
 * Описать класс куб.
 1) Найти площадь куба
 2) Найти объем куба
 3) Покрасить куб в определенный цвет.
 */
public class Lab16 {
    public static void main(String[] args) {
        int side = 3;
        Cube cube = new Cube();
        int resultV = cube.calculationVolume(side);
        int resultS = cube.calculationArea(side);
        cube.setPaint ("red");
        System.out.println("Объем куба = " + resultV + " Площадь  = " + resultS);
    }
}
