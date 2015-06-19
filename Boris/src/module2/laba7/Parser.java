package module2.laba7;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public abstract class Parser {

    private final static String XML_FILE_REGEX = "\\.xml$";

    public abstract List<Point> parseXML(File file) throws FileNotFoundException;

    protected boolean isXML(File file) {
        if (file.exists()) {
            if (Pattern.compile(XML_FILE_REGEX).matcher(file.getName()).find()) {
                return true;
            }
        }
        return false;
    }


}
