package task43;

//Напишите   программу,   моделирующую   кассы   в   магазине.Существует   несколько   касс,
// работающих   одновременно.   Общее количество  покупателей  может  быть  больше  чем  количество  касс,  но
//одновременно  не  может  обрабатываться  больше  покупателей,  чем имеется рабочих касс.
// У каждого покупателя есть набор товаров, которые  должны быть выведены  в процессе обслуживания
public class ShopTest {

    public static void main(String[] args) {
        int productQuantity = 10000;
        ProductsMonitor productsMonitorToShop = new ProductsMonitor(productQuantity, productQuantity, productQuantity);
        int productQuantityInBasket = 1;
        ProductsMonitor productsMonitorToClientsBasket = new ProductsMonitor(productQuantityInBasket, productQuantityInBasket, productQuantityInBasket);
        ClientsMainQueue clientsMainQueue = new ClientsMainQueue();
        for (int i = 0; i < productQuantity; i++) {
            clientsMainQueue.addClient(productsMonitorToClientsBasket);
        }
        int cashDeskQuantity = 20;
        Shop shop = new Shop(productsMonitorToShop, cashDeskQuantity);
        shop.work(clientsMainQueue);
    }
}
