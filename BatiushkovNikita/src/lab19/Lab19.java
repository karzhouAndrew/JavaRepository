package lab19;

// Performance (+ String) and (StringBuilder + append)

public class Lab19 {

    final static int NUM_OF_CYCLES = 100;
    final static String STR_ADD = "add ";

    public static void main(String[] args) {
        long perfString = StringTest(NUM_OF_CYCLES, STR_ADD);
        long perfStrBulder = strBuilderTest(NUM_OF_CYCLES, STR_ADD);
        long perfStrBuffer = strBufferTest(NUM_OF_CYCLES, STR_ADD);

        System.out.println("Perfomance string test for " + NUM_OF_CYCLES + " cycles.");
        System.out.println("\"String\" = " + perfString + " ns.");
        System.out.println("\"StringBuffer\" = " + perfStrBuffer + " ns.");
        System.out.println("\"StringBuilder\" = " + perfStrBulder + " ns.");
    }

    private static long strBufferTest(int numOfCycles, String strAdd) {
        StringBuffer strBufferTest = new StringBuffer();
        long startBufferTest = System.nanoTime();
        for (int i = 0; i < numOfCycles; i++) {
            strBufferTest.append(strAdd);
        }
        long stopBufferTest = System.nanoTime();
        return stopBufferTest - startBufferTest;
    }

    private static long strBuilderTest(int numOfCycles, String strAdd) {
        StringBuilder strBuilderTest = new StringBuilder();
        long startBuilderTest = System.nanoTime();
        for (int i = 0; i < numOfCycles; i++) {
            strBuilderTest.append(strAdd);
        }
        long stopBuilderTest = System.nanoTime();
        return stopBuilderTest - startBuilderTest;
    }

    private static long StringTest(int numOfCycles, String strAdd) {
        String strStringTest = "";
        long startStringTest = System.nanoTime();
        for (int i = 0; i < numOfCycles; i++) {
            strStringTest += strAdd;
        }
        long stopStringTest = System.nanoTime();
        return stopStringTest - startStringTest;
    }
}
