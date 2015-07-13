package lab41_2;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/**
 * Распарсить с помощью SAX, каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных запятой,
 * при этом должна выводиться единица измерения.
 */
public class SAXParser {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParserHandler handler = new SAXParserHandler();
        try {
            javax.xml.parsers.SAXParser parser = factory.newSAXParser();
            try {
                parser.parse(new File("tikhomirov\\src\\lab41_2\\PointsList.xml"),
                        handler);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        Iterator iterator = handler.returnPoints().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
