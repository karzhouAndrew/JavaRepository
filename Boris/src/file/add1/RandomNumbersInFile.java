package file.add1;

//Создать и заполнить файл случайными целыми числами.
// Отсортировать содержимое файла по возрастанию.


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomNumbersInFile {
    private File path;
    private String fileName;
    private Random rand = new Random();

    public RandomNumbersInFile() {
        this("../Test", "test.txt");
    }

    public RandomNumbersInFile(String path, String name) {
        this.path = new File(path);
        fileName = name;
        this.path.mkdirs();
    }

    public void writeRandomNumberToFile(int quantity){
        try(DataOutputStream writer = new DataOutputStream(new BufferedOutputStream( new FileOutputStream(path + "\\" + fileName)))) {
            addNumbersToFile(writer, quantity);
        } catch (IOException e) {
            System.out.println("Exception opened.");
        }
    }

    private void addNumbersToFile(DataOutputStream writer, int quantity) throws IOException {
        for (int i = 0; i < quantity; i++) {
            writer.write(getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return 10; //rand.nextInt(100);
    }

    public List<Integer> getListNumbersInFile (){
        List<Integer> numbers = new ArrayList<>();
        try (DataInputStream reader = new DataInputStream( new BufferedInputStream(new FileInputStream(path.getAbsoluteFile() + "\\" + fileName)))){
            addNumber(numbers, reader);
        } catch (FileNotFoundException e) {
            System.out.println("Exception file not found.");
        } catch (IOException e) {
            System.out.println("Exception opened file.");;
        }
        return numbers;
    }

    private void addNumber(List<Integer> numbers, DataInputStream reader) throws IOException {
        Integer number = reader.readInt();
        while (number != null){
            numbers.add(number);
            number = reader.readInt();
        }
    }

    public void deleteFile() {
        for (File fileName : path.listFiles()) {
            fileName.delete();
        }
    }

}
