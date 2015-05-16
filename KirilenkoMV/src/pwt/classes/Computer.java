package pwt.classes;

/**
 * Created by asus on 15.05.2015.
 */
public class Computer extends Technics {
    private String name;
    public Computer() {
        this.name = "Asus";
    }

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public void repair() {
        System.out.println("Мне переустановили Windows");
    }

    @Override
    public void destruction() {
        System.out.println("Меня разобрали");
    }

    public void calculate(){
        System.out.println("Вычисления.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
