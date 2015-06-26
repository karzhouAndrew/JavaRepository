package task43;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    public static void main(String[] args) {

        Products productsToShop = new Products(5000, 5000, 5000);
        Products productsToClientsBasket = new Products(1, 1, 1);
        Clients clients = new Clients();
        for (int i = 0; i < 5000; i++) {
            clients.addClient(productsToClientsBasket);
        }
        Shop shop = new Shop();
        shop.setProducts(productsToShop);
        List<CashDesk> cashDesks = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cashDesks.add(new CashDesk());
            cashDesks.get(i).setShop(shop);
        }
        shop.setCashDesks(cashDesks);
        shop.work(clients);
    }
}
