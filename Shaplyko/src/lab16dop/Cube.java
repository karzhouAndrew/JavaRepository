package lab16dop;

public class Cube {
    public int calculationArea(int side) {
        return side * side * 6;
    }

    public int calculationVolume(int side) {
        return side * side * side;
    }

    public void paint(String color) {
        String colorRGB;
        if (color == "black") {
            colorRGB = "Цвет куба черный";
        } else if (color == "red") {
            colorRGB = "Цвет куба красный";
        } else if (color == "green") {
            colorRGB = "Цвет куба зеленый";
        } else if (color == "blue") {
            colorRGB = "Цвет куба голубой";
        } else {
            colorRGB = "Invalid color";
        }
        System.out.println(colorRGB);
    }
}

