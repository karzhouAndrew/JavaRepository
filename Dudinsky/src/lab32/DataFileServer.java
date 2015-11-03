package lab32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFileServer {
    public void writeDoublesArray(double[] inputArray, String dataFilePath) {
        try (DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFilePath)))) {
            for (double currentDouble : inputArray) {
                outStream.writeDouble(currentDouble);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + dataFilePath);
        } catch (IOException e) {
            System.err.println("I/O exception: ");
            e.printStackTrace();
        }
    }

    public List<Double> retrieveAllDoublesFrom(String dataFilePath) {
        List<Double> retrievingNumbers = new ArrayList<>();
        try (DataInputStream inStream = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFilePath)))) {
            while (true) {
                try {
                    retrievingNumbers.add(inStream.readDouble());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + dataFilePath);
        } catch (IOException e) {
            System.err.println("I/O exception: ");
            e.printStackTrace();
        }
        return retrievingNumbers;
    }
}
