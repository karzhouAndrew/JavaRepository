package lab41and42;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.text.ParseException;

public class StaxParser {

    public ProcessingPoint parseXML(String fileName) {
        InputStream inputStream = null;
        XMLStreamReader reader = null;
        ProcessingPoint processingPoint = null;
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            inputStream = new FileInputStream(fileName);
            reader = inputFactory.createXMLStreamReader(inputStream);
            processingPoint = doParsing(reader);
        } catch (XMLStreamException e) {
            System.out.println("Error occurred during parsing XML");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("ParsingException");
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("IO exception");
                }
            }
        }
        return processingPoint;
    }

    private ProcessingPoint doParsing(XMLStreamReader reader) throws XMLStreamException, ParseException {
        int x = 0;
        int y = 0;
        String unit = null;
        ProcessingPoint processingPoint = new ProcessingPoint();
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == reader.START_ELEMENT) {
                if (reader.getLocalName().equals("point")) {
                    unit = (reader.getAttributeValue(0));
                } else if (reader.getLocalName().equals("x")) {
                    x = (Integer.parseInt(reader.getElementText()));

                } else if (reader.getLocalName().equals("y")) {
                    y = (Integer.parseInt(reader.getElementText()));
                    processingPoint.addPoint(new Point(x, y, unit));
                }
            }
        }
        return processingPoint;
    }
}
