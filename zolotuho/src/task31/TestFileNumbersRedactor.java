package task31;

import java.io.File;
import java.io.IOException;

public class TestFileNumbersRedactor {

    public static void main(String[] args) {
        File path = new File("./src/task31/task31.txt");
        FileNumbersRedactor fileNumbersRedactor = new FileNumbersRedactor();
        try {
            System.out.println("founded numbers");
            System.out.println(fileNumbersRedactor.findNumbers(path));
            System.out.print("sum = ");
            System.out.println(fileNumbersRedactor.sumNumbers(fileNumbersRedactor.findNumbers(path)));
            System.out.println("unique numbers");
            System.out.println(fileNumbersRedactor.convertToSet(fileNumbersRedactor.findNumbers(path)));
        } catch (IOException e) {
            System.out.println("IO exception occurred");
        }catch (NumberFormatException e){
            System.out.println("can not parse double format");
        }
    }
}
