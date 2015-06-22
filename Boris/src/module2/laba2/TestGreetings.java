package module2.laba2;


public class TestGreetings {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.getGreetings("US"));
        System.out.println(greetings.getGreetings("exception"));
        System.out.println(greetings.getGreetings("BY"));
        System.out.println(greetings.getGreetings("exception"));
        System.out.println(greetings.getGreetings("RU"));
        System.out.println(greetings.getGreetings("exception"));
        System.out.println(greetings.getGreetings());
        System.out.println(greetings.getGreetings("exception"));
    }
}
