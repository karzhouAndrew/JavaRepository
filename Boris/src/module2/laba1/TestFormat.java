package module2.laba1;



public class TestFormat {
    public static void main(String[] args) {
        double money = 153.5;
//        Formatting.seeLocales();
        Formatting format = new Formatting();
        System.out.println(format.currency(money));
        format.setLocale("ua", "UA");
        System.out.println(format.currency(money));
    }
}
