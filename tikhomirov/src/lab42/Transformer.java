package lab42;

import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Transformer {

    public void transform(String XSL_File, String XML_File) throws TransformerException, FileNotFoundException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource streamSource = new StreamSource(new File(XSL_File));
        Templates templates = transformerFactory.newTemplates(streamSource);
        javax.xml.transform.Transformer transformer = templates.newTransformer();
        transformer.transform(new StreamSource(new File(XML_File)),
                new StreamResult(new FileOutputStream
                        (new File("tikhomirov\\src\\lab42\\example.html"))));
    }
}
