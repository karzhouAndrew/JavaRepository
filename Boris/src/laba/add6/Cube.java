package laba.add6;

//Class Cube.
//Constructor, Get & Set Color & Side. Get area and capacity.

public class Cube {
    private double side;
    private String color;

    Cube(double side) {
        if (side <= 0) {
            System.out.println("\nСторона куба не может быть отрицательна или равна 0. Длина стороны установлена равной 3.");
            this.side = 3;
        } else {
            this.side = side;
        }
        color = "Transparent";
    }

    public Cube(double side, String color) {
        if (side <= 0) {
            System.out.println("\nСторона куба не может быть отрицательна или равна 0. Длина стороны установлена равной 3.");
            this.side = 3;
        } else {
            this.side = side;
        }
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("\nСторона куба не может быть отрицательна или равна 0. Длина стороны установлена равной 3.");
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

    public double getArea() {
        return 6 * side * side;
    }

    public double getCapacity() {
        return side * side * side;
    }
}
