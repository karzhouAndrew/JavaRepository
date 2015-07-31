package cashbox;

/**
 * Created by champion on 25.06.15.
 */
public enum Goods {
    BREAD("хлеб"), LOAF("батон"), FISH("рыба"), MILK("молоко"), COLA("кока-кола"), ICECREAM("мороженое"), POTATO("картошка"),
    MEAT("мясо"), CHICKEN("курица"), TURKEY("индюшатина"), FAT("сало"), EGGS("яйца"), CHAMPAGNE("шампанское"), PASTA("макароны"), FLOUR("мука");

    private String name;
    Goods(String str) {
        name = str;
    }

    @Override
    public String toString() {
        return " " + name + " ";
    }
}
