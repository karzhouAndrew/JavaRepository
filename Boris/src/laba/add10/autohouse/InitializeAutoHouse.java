package laba.add10.autohouse;


import java.util.Random;

public class InitializeAutoHouse {
    private static String[] company =
            {"BMV", "Opel", "Citroen", "Mercedes-Benz", "Hyundai", "Renault", "Honda", "Ford", "Kia",
                    "Mazda", "Skoda", "Volkswagen"};
    private static String[] color = {"Green", "Red", "Blue", "Yellow", "Orange", "Purple", "Black", "White", "Brown"};
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
            listingAutoHouse.addCarInAutoHouse(randCompany(), randColor(), minYear + year, randPrice(year));
        }
        return listingAutoHouse;
    }

    private static int randPrice(int year) {
        return random.nextInt(10000) + (maxYear - minYear - year)*1000;
    }

    private static int randYear(int minYear, int maxYear) {
        return random.nextInt(maxYear - minYear + 1);
    }


    private static String randColor() {
        return color[random.nextInt(color.length)];
    }

    private static String randCompany() {
        return company[random.nextInt(company.length)];
    }

}
