package park.parser;


import park.plant.Plant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.regex.Pattern;

public abstract class Parser {
    private final static String XML_FILE_REGEX = "\\.xml$";
    public List<Plant> plants;

    public abstract void parseXML(File file) throws FileNotFoundException;

    public static boolean isXML(File file) throws FileNotFoundException {
        if (file.exists()) {
            if (Pattern.compile(XML_FILE_REGEX).matcher(file.getName()).find()) {
                return true;
            }
        } else {
            throw new FileNotFoundException(file.getPath());
        }
        return false;
    }

    public List<Plant> getPlants() {
        return plants;
    }
}
