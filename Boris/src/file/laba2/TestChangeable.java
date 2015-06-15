package file.laba2;


import java.io.IOException;

public class TestChangeable {
    public static void main(String[] args) throws IOException {
        ChangedJavaFile file = new ChangedJavaFile("0test.java");
        file.replacePrivateToPublic();
        System.out.println(file.seeFile());
    }
}
