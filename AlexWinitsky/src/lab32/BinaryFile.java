package lab32;

import java.io.*;
import java.util.Arrays;


public class BinaryFile {

    public void writeFile(String path) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
            for (int i = 0; i < 20; i++) {
                dataOutputStream.writeInt((int) (Math.random() * 100));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[] readFile(String path) {
        int array[] = new int[20];
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(path))) {
            for (int i = 0; i < 19; i++) {
                array[i] = dataInputStream.readInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    public int arithmeticMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public void printNumber(int array[]) {
        System.out.println(Arrays.toString(array));
    }
}
