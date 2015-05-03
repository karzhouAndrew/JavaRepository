package oop;

/**
 * Created by asus on 03.05.2015.
 */
public class Cube {
    private double hight;
    private double width;
    private double length;
    private String color;

    public Cube(double hight, double width, double length, String color) {
        this.hight = hight;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Cube(double hight, double width, double length) {
        this.hight = hight;
        this.width = width;
        this.length = length;
    }

    public double calulateS() {
        return 2 * (hight * width + hight * length + width * length);
    }

    public double calulateV() {
        return hight * width * length;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
