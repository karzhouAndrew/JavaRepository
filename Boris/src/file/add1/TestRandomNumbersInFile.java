package file.add1;



public class TestRandomNumbersInFile {
    public static void main(String[] args) {

        RandomNumbersInFile file = new RandomNumbersInFile();
        file.writeRandomNumberToFile(10);
        System.out.println(file.getSortNumbers());
        file.deleteFile(file.getPath());
    }
}
