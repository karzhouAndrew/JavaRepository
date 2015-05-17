package inheritance;


public class B extends A {

    private double pi = 3.14;

    public B() {
        printPi();
    }

    @Override
    public void printPi() {
        System.out.println(pi);
    }
}
