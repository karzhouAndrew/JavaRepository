package lab24;


public class Lab24Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("Atlant", "White", 100, 380, "250x60x60", "Top position", true);
        Oven oven = new Oven("Bosch", "White", 50, 380, "80x60x60", "Gas");
        Microwave microwave = new Microwave("Horizont", "Black", 20, 20, 800);
        Blender blender = new Blender("Vitek", "Siler", 5, 5, 10);
        System.out.println("Микроволновка: " + microwave.toString());
        System.out.println("Микроволновка подключена: " + microwave.pluggedIn());
        System.out.println("Духовая печь подключена: " + oven.pluggedIn());
        System.out.println("Блендер печь подключен: " + blender.pluggedIn());
        System.out.println("Холодильник подключен: " + refrigerator.pluggedIn());
        System.out.println("У микроволновки есть экран и индикатор: " + microwave.ledDisplay() + ", " + microwave.timeIndicator());

    }


}
