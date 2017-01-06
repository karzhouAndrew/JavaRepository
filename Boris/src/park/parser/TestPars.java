package park.parser;


import park.parser.dom.DOMParser;
import park.parser.sax.SAXParser;
import park.parser.stax.StAXParser;

import java.io.File;
import java.io.FileNotFoundException;

public class TestPars {
    public static void main(String[] args) {
        Parser parser = new SAXParser();
        try {
            parser.parseXML(new File("Boris/src/park/xml/park.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(parser.getPlants());
    }
}
