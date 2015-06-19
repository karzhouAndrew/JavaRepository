package module2.laba7;


import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Parser parser = new SAXParser();
        File file = new File("Boris/src/module2/laba7/PointListXSD.xml");
        parser.parseXML(file);
    }
}
