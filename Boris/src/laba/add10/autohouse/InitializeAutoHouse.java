package laba.add10.autohouse;


import java.util.Random;

public class InitializeAutoHouse {
    private static Enum<CompanyEnum> company;
    private static int minYear = 1990;
    private static int maxYear = 2015;
    private static Random random = new Random();

    public static AutoHouse generateQuantityCarInAutoHouse(int quantity) {
        if (quantity < 1) {
            System.out.println("Exception. Quantity is 5.");
            quantity = 5;
        }
        AutoHouse listingAutoHouse = new AutoHouse();
        for (int i = 0; i < quantity; i++) {
            int year = randYear(minYear, maxYear);
            listingAutoHouse.addCarInAutoHouse(randCompany(), minYear + year, randPrice(year));
        }
        return listingAutoHouse;
    }

    private static int randPrice(int year) {
        return random.nextInt(10000) + year * 1000;
    }

    private static int randYear(int minYear, int maxYear) {
        return random.nextInt(maxYear - minYear + 1);
    }

    private static CompanyEnum randCompany() {
        CompanyEnum[] arrayEnum = CompanyEnum.values();
        return arrayEnum[(random.nextInt(arrayEnum.length))];
    }

}
