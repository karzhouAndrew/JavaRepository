package file.laba4;


import java.io.IOException;

public class TestChangeableFile {
    public static void main(String[] args) {
        try {
            ChangedJavaFile file = new ChangedJavaFile("00test.java");
            file.changeable();
            System.out.println(file.seeFile(file.getFile()));
        } catch (IOException e) {
            System.out.println("File not found exception.");
        }
    }
}
