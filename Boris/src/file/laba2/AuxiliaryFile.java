package file.laba2;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class AuxiliaryFile {
    private File path;
    private StringBuilder text;
    private static int nextFileName = 0;

    public AuxiliaryFile() {
        this("./Boris/src/file", "temp.txt");
    }

    public AuxiliaryFile(File path) {
        this.path = path;
        createFileOrGenerateNewName();
    }

    public AuxiliaryFile(String path, String name) {
        setPath(path, (nextFileName++) + name);
        createFileOrGenerateNewName();
    }

    private void setPath(String path, String name) {
        this.path = new File(path + "\\" + name);
    }

    private void createFileOrGenerateNewName() {
        if (path.exists()) {
            setPath(path.getParent(), (nextFileName++) + path.getName());
            createFileOrGenerateNewName();
        } else {
            createFile();
        }
    }

    private void createFile() {
        this.path.getParentFile().mkdirs();
        try {
            this.path.createNewFile();
        } catch (IOException e) {
            System.out.println("File not created.");
        }
    }

    public void writeLineToFile(StringBuilder str) {
        writeToFile(str.append("\\n"));
    }

    public void writeToFile(StringBuilder str) {
        try (PrintWriter writer = new PrintWriter(path)) {
            writer.print(str);
        } catch (IOException e) {
            System.out.println("File not written.");
        }
    }

    public void changeName(String name){
        path.renameTo(new File(path.getParent() + "\\" + name));

    }

    public static void deleteFile(File path) {
        if (path.exists()) {
            path.delete();
        }
    }

    public void deleteThisFile(){
        deleteFile(path);
    }

    public void replaceOriginal(){
        String originalName = getName(path.getName());
        File pathDelete = new File(path.getParent() + originalName);
        deleteFile(pathDelete);
        changeName(originalName);
    }

    private String getName(String name) {
        int charStartIndex = 1;
        int quantityFile = nextFileName;
        while ((quantityFile%=10) < 1){
            charStartIndex++;
        }
        return name.substring(charStartIndex);
    }

    public File getPath() {
        return path;
    }
}
