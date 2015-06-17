package cube;


/**
 * Created by dmitry on 7.6.15
 */
public class Figure {
    public static void main(String[] args) {
        Cube cube = new Cube(10);
        System.out.println("Площадь куба = " + cube.squareFigure());
        System.out.println("Объем куба равен = " + cube.volumeFigure());
        cube.setCubeColor("blue");
        System.out.println("Цвет куба -- " + cube.getCubeColor());
    }
}
