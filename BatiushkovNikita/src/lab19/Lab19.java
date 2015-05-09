package lab19;

// Performance (+ String) and (StringBuilder + append)

public class Lab19 {
    public static void main(String[] args) {
        int numOfCycles = 100;
        String strAdd = "add ";

        String strStringTest = "";
        long startStringTest = System.nanoTime();
        for (int i = 0; i < numOfCycles; i++) {
            strStringTest += strAdd;
        }
        long stopStringTest = System.nanoTime();
        long perfString = stopStringTest - startStringTest;
        System.out.println("Performance + and String  = " + perfString);

        StringBuilder strBuilderTest = new StringBuilder();
        long startBuilderTest = System.nanoTime();
        for (int i = 0; i < numOfCycles; i++) {
            strBuilderTest.append(strAdd);
        }
        long stopBuilderTest = System.nanoTime();
        long perfStrBulder = stopBuilderTest - startBuilderTest;
        System.out.println("Performance append() and StringBulser = " + perfStrBulder);

        System.out.println(perfString / perfStrBulder + " times faster.");
    }
}
