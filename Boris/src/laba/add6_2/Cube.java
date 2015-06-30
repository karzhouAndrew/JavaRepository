package laba.add6_2;

//Class Cube.
//Constructor, Get & Set Color & Side. Get area and capacity.

public class Cube {
    private double side;
    private String color;

    public Cube(double side) {
        new Cube(side, "Transparent");
    }

    public Cube(double side, String color) {
        if (side <= 0) {
            System.out.println("\nСторона куба должна быть больше 0, а не " + side + ". Длина стороны установлена равной 3.");
            this.side = 3;
        } else {
            this.side = side;
        }
        this.color = color;
    }

    public double getLengthSide() {
        return side;
    }

    public void setLengthSide(double side) {
        if (side <= 0) {
            System.out.println("\nСторона куба должна быть больше 0, а не " + side + ". Длина стороны установлена равной 3.");
            this.side = 3;
        } else {
            this.side = side;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 6 * side * side;
    }

    public double calculateCapacity() {
        return side * side * side;
    }
}
