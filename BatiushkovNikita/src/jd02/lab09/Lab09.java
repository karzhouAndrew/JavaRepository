package jd02.lab09;

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lab09 {
    public static void main(String[] args) throws TransformerException, FileNotFoundException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource streamSource = new StreamSource(new File("./BatiushkovNikita/src/jd02/lab09/lab09.xsl"));
        Templates templates = transformerFactory.newTemplates(streamSource);
        Transformer transformer = templates.newTransformer();
        transformer.transform(new StreamSource(new File("./BatiushkovNikita/src/jd02/lab09/lab09.xml")),
                new StreamResult(new FileOutputStream(new File("./BatiushkovNikita/src/jd02/lab09/lab09.html"))));
    }
}
