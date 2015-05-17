package addtask7;

/**
 * Created by Master on 04.05.2015.
 */
public class Cube {
    int side;
    String color;

    Cube(int side, String color){
        this.side=side;
        this.color=color;
        System.out.println("Создан объект куб, с стороной = " + this.side + " и цветом =  "+ this.color );
    }

    public int squareCube(){
        return 6*this.side*this.side;
    }

    public int volumeCube(){
        return this.side*this.side*this.side;
    }

    void colorCube(String newColor){
        this.color=newColor;
        System.out.println("Установлен новый цвет куба "+this.color);
    }
}
