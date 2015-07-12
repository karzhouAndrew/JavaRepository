//package park.parser.sax;
//
//
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//import org.xml.sax.XMLReader;
//import org.xml.sax.helpers.XMLReaderFactory;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class SAXParser extends Parser {
//
//    @Override
//    public void parseXML(File file) throws FileNotFoundException {
//        if (super.isXML(file)) {
//            super.points = getPoints(file);
//            return;
//        }
//        throw new FileNotFoundException(file.getPath());
//    }
//
//    private List<Point> getPoints(File file) {
//        try {
//            XMLReader reader = XMLReaderFactory.createXMLReader();
//            SAXParsing saxParsing = new SAXParsing();
//            reader.setContentHandler(saxParsing);
//            InputSource source = new InputSource(file.getCanonicalPath());
//            reader.parse(source);
//            points = saxParsing.getPoints();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return points;
//    }
//}
