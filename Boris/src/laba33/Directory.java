package laba33;


import java.io.File;
import java.util.List;

public class Directory {
    private File path;
    private Catalogue catalogues;

    public Directory(String path) {
        this.path = new File(path);
        isExist();
    }

    private void isExist() {
        if (path.exists()) {
            catalogues = new Catalogue(path);
        } else {
            System.out.println("Exception. There are no such catalogue.");
        }
    }

    public StringBuilder seeFiles() {
        if (path.exists()) {
            return isFileExist(catalogues.getFiles());
        } else {
            return new StringBuilder("Exception. There are no such catalogue.!!!");
        }
    }

    private StringBuilder isFileExist(List<String> names) {
        if (path.isFile()) {
            return new StringBuilder("Exception. This is file!!!");
        } else {
            StringBuilder strB = new StringBuilder();
            isEmptyCatalogue(strB, names);
            return strB;
        }
    }

    private void isEmptyCatalogue(StringBuilder strB, List<String> names) {
        if (names.isEmpty()) {
            strB.append("The folder is empty.");
        } else {
            strB.append(catalogues.getName()).append(" folder contains:\n");
            addElementToStrBuilder(strB, names);
        }
    }

    public StringBuilder seeCatalogues() {
        if (path.exists()) {
            return isFileExist(catalogues.getCatalogue());
        } else {
            return new StringBuilder("Exception. There are no such catalogue.!!!");
        }
    }

    private void addElementToStrBuilder(StringBuilder strB, List<String> names) {
        for (String name : names) {
            strB.append(name).append("\n");
        }
    }


}
