package file.laba4;


import java.io.IOException;

public class TestChangeableFile {
    public static void main(String[] args) {
        try {
            ChangedJavaFile file = new ChangedJavaFile("0test.java");
            file.changeable();
            System.out.println(file.seeFile());
        } catch (IOException e) {
            System.out.println("File not found exception.");
        }
    }
}
