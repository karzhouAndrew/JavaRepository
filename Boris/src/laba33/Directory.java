package laba33;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Directory {
    private Catalogue library;
    private String pathFile;

    public Directory(String directory) {
        pathFile = directory;
        isFileExist(directory);
    }

    private void isFileExist(String directory) {
        if (new File(directory).exists()) {
            isDirectory(directory);
        } else {
            System.out.println("Exception. There are no such directory.");
        }
    }

    private void isDirectory(String directory) {
        File pathElement = new File(directory);
        if (pathElement.isDirectory()) {
            library = new Catalogue(directory);
        } else if (pathElement.isFile()) {
            pathFile = directory;
            System.out.println("This is file.");
        }
    }

    public StringBuilder getStringBuilderCatalogs() {
       return library.getCatalogue(library);
    }

    private StringBuilder getStringBuilder(List<String> names) {
        StringBuilder str = new StringBuilder();
        for (String fileName : names) {
            str.append(fileName).append("\n");
        }
        return str;
    }

//    private List<String> getFolder() {
//        return library.getCatalogue();
//    }

    private List<String> getFileList() {
        return library.getFiles();
    }

    public StringBuilder getStringBuilderFiles() {
        StringBuilder str = new StringBuilder();
        for (String fileName : getFileList()) {
            str.append(fileName).append("\n");
        }
        return str;
    }
}
