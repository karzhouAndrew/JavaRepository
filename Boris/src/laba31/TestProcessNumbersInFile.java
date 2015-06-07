package laba31;


public class TestProcessNumbersInFile {
    public static void main(String[] args) {
        ProcessNumbersInFile test = new ProcessNumbersInFile();

        test.addNumberToArrayFromFile("textForTesting.txt");
        System.out.println(test.getNumbersInFile());
        System.out.println(test.sumNumbersInText());
        System.out.println(test.getDifferentNumbers());
        test.removeListNumbers();
        test.addNumbersFromFile("textForTesting.txt");
        System.out.println(test.getNumbersInFile());
        System.out.println(test.sumNumbersInText());
        System.out.println(test.getDifferentNumbers());

    }
}
