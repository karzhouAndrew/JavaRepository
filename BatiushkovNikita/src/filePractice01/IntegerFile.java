package filePractice01;

import java.io.*;

public class IntegerFile {
    private static final String FILE_PATH = "./BatiushkovNikita/src/filePractice01/Dir/IntegerFile.txt";

    private int quantity = 10;
    private int minValue = 0;
    private int maxValue = 100;

    public IntegerFile() {
        createFile(FILE_PATH);
        writeFile(FILE_PATH);
    }

    public IntegerFile(int quantity, int minValue, int maxValue) {
        createFile(FILE_PATH);
        this.quantity = quantity;
        this.minValue = minValue;
        this.maxValue = maxValue;
        writeFile(FILE_PATH);
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void writeFile(String filePath) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)))) {
            for (int i = 0; i < getQuantity(); i++) {
                dataOutputStream.writeBytes(String.valueOf(generateRandomInt(getMinValue(), getMaxValue())));
                dataOutputStream.writeBytes(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot write in file.");
        }
    }

    public int generateRandomInt(int minValue, int maxValue) {
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }

    public void createFile(String filePath) {
        File file = new File(filePath);
        try {
            file.getParentFile().mkdir();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot create file.");
        }
    }
}
