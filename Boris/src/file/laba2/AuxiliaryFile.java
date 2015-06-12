package file.laba2;


import java.io.*;


public class AuxiliaryFile {
    private File path;
    private StringBuilder text;
    private static int nextFileName = 0;

    public AuxiliaryFile() {
        this("./Boris/src/file", "temp.txt");
    }

    public AuxiliaryFile(File path) throws IOException {
        this.path = new File(String.valueOf(path.getCanonicalFile()));
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
        writeToFile(str);
    }

    public void writeToFile(StringBuilder str) {
        try (PrintWriter writer = new PrintWriter(new BufferedOutputStream (new FileOutputStream(path, true)))) {
            writer.println(str);
        } catch (IOException e) {
            System.out.println("File not written.");
        }
    }


    public static void deleteFile(File path) {
        if (path.exists()) {
            path.delete();
        }
    }

    public void deleteThisFile() {
        deleteFile(path);
    }

    public void replaceOriginal(File file) {
        deleteFile(file);
        changeName(file);
    }

    private void changeName(File file) {
        path.renameTo(file);

    }

    private String getName(String name) {
        int charStartIndex = 1;
        int quantityFile = nextFileName;
        while ((quantityFile %= 10) < 1) {
            charStartIndex++;
        }
        return name.substring(charStartIndex);
    }

    public File getPath() {
        return path;
    }
}
