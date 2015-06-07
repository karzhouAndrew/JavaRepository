package laba33;


import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Catalogue {
    private List<String> files;
    private Map<String, Catalogue> catalogue;
    private String name;
    private File path;
    private static final String CATALOGUE_NAME_REGEX = "[^\\\\]+$";


    public Catalogue(String name) {
        this.path = new File(name);
        this.name = getNameCatalogue(path.toString());
        files = new ArrayList<>();
        catalogue = new HashMap<>();
        addExist();
    }

    private String getNameCatalogue(String name) {
        Matcher matcher = Pattern.compile(CATALOGUE_NAME_REGEX).matcher(name);
        matcher.find();
        return  matcher.group();
    }

    private void addExist() {
       String [] allInputName = path.list();
        for (String dir : allInputName) {
            String wholeDir = path.toString() +"\\" + dir;
            isFile(wholeDir,  new File(wholeDir));
        }
    }

    private void isFile(String dir, File file) {
        if (file.isFile()) {
            files.add(getNameCatalogue(dir));
        } else {
            catalogue.put(name, new Catalogue(dir));
        }
    }

    public StringBuilder getCatalogue(Map<String, Catalogue> map) {
        StringBuilder str = new StringBuilder();
        str.append(name).append("\t");
        if (map.isEmpty()){
            str.append("\n");
        }else {
            for (String key : map.keySet()) {
                str.append(getCatalogue(map.get(key).catalogue));
            }
        }
        return str;
    }

    public List<String> getFiles() {
        return files;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Catalogue catalogue1 = (Catalogue) o;

        if (catalogue != null ? !catalogue.equals(catalogue1.catalogue) : catalogue1.catalogue != null) return false;
        if (files != null ? !files.equals(catalogue1.files) : catalogue1.files != null) return false;
        if (name != null ? !name.equals(catalogue1.name) : catalogue1.name != null) return false;
        if (path != null ? !path.equals(catalogue1.path) : catalogue1.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = files != null ? files.hashCode() : 0;
        result = 31 * result + (catalogue != null ? catalogue.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
