package park.parser;


import park.parser.dom.DOMParser;

import java.io.File;
import java.io.FileNotFoundException;

public class TestPars {
    public static void main(String[] args) {
        Parser parser = new DOMParser();
        try {
            parser.parseXML(new File("park/xml/park.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(parser.getPlants());
    }
}
