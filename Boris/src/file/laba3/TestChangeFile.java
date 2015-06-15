package file.laba3;


import java.io.FileNotFoundException;

public class TestChangeFile {
    public static void main(String[] args) {
        try {
            ChangeJavaFile file = new ChangeJavaFile("./0test.java");
            file.changeFile();
            System.out.println(file.readFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
