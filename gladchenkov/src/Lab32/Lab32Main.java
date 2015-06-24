package Lab32;


import java.io.IOException;

public class Lab32Main {
    public static void main(String[] args) throws IOException {
        TextFile textFile = new TextFile();
        String filePath = "binaryfile.dat";
        textFile.writeRandomNumbersInFile(filePath);
        System.out.println(TextFile.readFile(filePath));
        System.out.println("Среденее арифметическое: " + TextFile.calculateAverage(TextFile.readFile(filePath)));


    }
}
