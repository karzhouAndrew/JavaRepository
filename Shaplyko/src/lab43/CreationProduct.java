package lab43;

import java.util.ArrayList;
import java.util.List;

public class CreationProduct {
    private List<Product> shop = new ArrayList<>();
    private List<Product> shoppingCart = new ArrayList<>();

    public CreationProduct() {
        addShop();
    }

    private void addShop() {
        shop.add(new Product("Хлеб черный", 5000));
        shop.add(new Product("Хлеб белый", 7000));
        shop.add(new Product("Молоко", 15000));
        shop.add(new Product("Сок", 19000));
        shop.add(new Product("Кофе черный", 75000));
        shop.add(new Product("Мясо птицы", 40000));
    }


    public void shoppingCart() {
        int x = (int) (Math.random() * 5);
        for (int i = 0; i < x; i++) {
            shoppingCart.add(shop.get(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < shoppingCart.size(); i++) {
            output.append(shoppingCart.get(i));
            output.append(", ");
        }
        return output.toString();
    }

    synchronized public int ticketWindow() {
        int sum = 0;
        for (int i = 0; i < shoppingCart.size(); i++) {
            sum = sum + shoppingCart.get(i).getPrice();
        }
        return sum;
    }
}
