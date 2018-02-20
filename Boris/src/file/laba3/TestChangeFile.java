package file.laba3;


import java.io.FileNotFoundException;

public class TestChangeFile {
    public static void main(String[] args) {
        try {
            ChangeJavaFile file = new ChangeJavaFile("./00test.java");
            file.changeFile();
            System.out.println(file.readFile(file.getFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
