package task43;

//Напишите   программу,   моделирующую   кассы   в   магазине.Существует   несколько   касс,
// работающих   одновременно.   Общее количество  покупателей  может  быть  больше  чем  количество  касс,  но
//одновременно  не  может  обрабатываться  больше  покупателей,  чем имеется рабочих касс.
// У каждого покупателя есть набор товаров, которые  должны быть выведены  в процессе обслуживания
public class ShopTest {

    public static void main(String[] args) {

        Products productsToShop = new Products(50000, 50000, 50000);
        Products productsToClientsBasket = new Products(1, 1, 1);
        Clients clients = new Clients();
        for (int i = 0; i < 50000; i++) {
            clients.addClient(productsToClientsBasket);
        }
        Shop shop = new Shop(productsToShop, 20);
        shop.work(clients);
    }
}
