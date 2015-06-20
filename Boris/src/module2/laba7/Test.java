package module2.laba7;


import module2.laba7.parser.Parser;
import module2.laba7.parser.dom.DOMParser;
import module2.laba7.parser.sax.SAXParser;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Parser parser = new SAXParser();
        File file = new File("Boris/src/module2/laba7/other/PointListXSD.xml");
        System.out.println(parser.parseXML(file));
    }
}
