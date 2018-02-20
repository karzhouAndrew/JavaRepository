package module2.laba7.parser;


import module2.laba7.other.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.regex.Pattern;

public abstract class Parser {
    private final static String XML_FILE_REGEX = "\\.xml$";
    public List<Point> points;

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

    @Override
    public String toString() {
        return "Parser{" +
                "points=" + points +
                '}';
    }

    public List<Point> getPoints() {
        return points;
    }
}
