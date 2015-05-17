package lab16dop;

public class Cube {
    public int area(int a) {
        return (a * a * 6);
    }
    public int volume(int a) {
        return (a * a * a);
    }
    public void paint(String color) {
        String colorRGB;
        if (color == "black") {
            colorRGB = "Цвет куба черный";
        } else if (color =="red") {
            colorRGB = "Цвет куба красный";
        } else if (color =="green") {
            colorRGB = "Цвет куба зеленый";
        } else if (color =="blue") {
            colorRGB = "Цвет куба голубой";
        } else {
            colorRGB = "Invalid color";
        }
        System.out.println(colorRGB);
    }
}

