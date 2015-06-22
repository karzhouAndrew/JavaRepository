package laba32;


public class TestBinaryFile {
    public static void main(String[] args) {
        BinaryFile file = new BinaryFile("./binary.txt");
        file.writeNumberToBinaryFile(3);
        System.out.println(file.getNumbersFromBinaryFile());
        System.out.println("Average = " + file.calculateAverage());

    }
}
