package laba33;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<String> files;
    private List<String> catalogues;
    private String name;
    private File path;


    public Catalogue(File path) {
            this.path = path;
            this.name = this.path.getName();
            files = new ArrayList<>();
            catalogues = new ArrayList<>();
            isCatalogue();
    }

    private void isCatalogue() {
        if (path.isDirectory()) {
            addExist();
        }
    }

    private void addExist() {
        String[] allInputName = path.list();
        for (String dir : allInputName) {
            isFile(dir);
        }
    }

    private void isFile(String dir) {
        File file = new File(path.toString() + "\\" + dir);
        if (file.isFile()) {
            files.add(dir);
        } else {
            catalogues.add(dir);
        }
    }

    public List<String> getCatalogue() {
        return catalogues;
    }

    public List<String> getFiles() {
        return files;
    }

    public String getName() {
        return name;
    }
}
