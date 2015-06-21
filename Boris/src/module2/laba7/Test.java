package module2.laba7;


import module2.laba7.other.Console;
import module2.laba7.parser.Parser;
import module2.laba7.parser.dom.DOMParser;
import module2.laba7.parser.sax.SAXParser;
import module2.laba7.parser.stax.StAXParser;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("Boris/src/module2/laba7/other/PointListXSD.xml");
//        Parser parser = new StAXParser();
//        parser.parseXML(file);
//        System.out.println(parser.getPoints());
//
//        Parser parser1 = new SAXParser();
//        parser1.parseXML(file);
//        System.out.println(parser1.getPoints());
//
//        Parser parser2 = new DOMParser();
//        parser2.parseXML(file);
//        System.out.println(parser2.getPoints());
        Console.runConsole();
    }
}
