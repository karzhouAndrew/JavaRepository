package lab19;

// Performance (+ String) and (StringBuilder + append)

public class Lab19 {

    public final static int NUM_OF_CYCLES = 100;
    public final static String STR_ADD = "add ";

    public static void main(String[] args) {
        long startBufferTest = System.nanoTime();
        strBufferTest();
        long stopBufferTest = System.nanoTime();
        long performanceStrBuffer = stopBufferTest - startBufferTest;

        long startBuilderTest = System.nanoTime();
        strBuilderTest();
        long stopBuilderTest = System.nanoTime();
        long performanceStrBuilder = stopBuilderTest - startBuilderTest;

        long startStringTest = System.nanoTime();
        stringTest();
        long stopStringTest = System.nanoTime();
        long performanceString = stopStringTest - startStringTest;


        System.out.println("Perfomance string test for " + NUM_OF_CYCLES + " cycles.");
        System.out.println("\"String\" = " + performanceString + " ns.");
        System.out.println("\"StringBuffer\" = " + performanceStrBuffer + " ns.");
        System.out.println("\"StringBuilder\" = " + performanceStrBuilder + " ns.");
    }

    private static void strBufferTest() {
        StringBuffer strBufferTest = new StringBuffer();
        for (int i = 0; i < NUM_OF_CYCLES; i++) {
            strBufferTest.append(STR_ADD);
        }
    }

    private static void strBuilderTest() {
        StringBuilder strBuilderTest = new StringBuilder();
        for (int i = 0; i < NUM_OF_CYCLES; i++) {
            strBuilderTest.append(STR_ADD);
        }
    }

    private static void stringTest() {
        String strStringTest = "";
        for (int i = 0; i < NUM_OF_CYCLES; i++) {
            strStringTest += STR_ADD;
        }
    }
}
