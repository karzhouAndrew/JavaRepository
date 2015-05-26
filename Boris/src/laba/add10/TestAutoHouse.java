package laba.add10;


import laba.add10.autohouse.AutoHouse;
import laba.add10.autohouse.InitializeAutoHouse;

public class TestAutoHouse {
    public static void main(String[] args) {
        int quantityCars = 10;
        AutoHouse listing = InitializeAutoHouse.generateQuantityCarInAutoHouse(quantityCars);
        System.out.println(listing);
    }
}
