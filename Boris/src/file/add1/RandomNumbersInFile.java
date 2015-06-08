package file.add1;

//Создать и заполнить файл случайными целыми числами.
// Отсортировать содержимое файла по возрастанию.


import java.io.File;
import java.io.OutputStreamWriter;


public class RandomNumbersInFile {
    private File path;

    public RandomNumbersInFile() {
        this(new File("../Test", "test"));
    }

    public RandomNumbersInFile(String path, String name) {
        this.path = new File(path);
        this.path.mkdirs();
        create(name);
    }

    private void create(String name) {
        try (OutputStreamWriter write = new OutputStreamWriter(name)){

        }
    }

    public void deleteFile(){
    for (File fileName : path.listFiles()) {
        fileName.delete();
    }
}

}
