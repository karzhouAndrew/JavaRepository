package lab42;

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class XMLTransformer {


    public void transform() throws TransformerException, FileNotFoundException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource streamSource = new StreamSource(new File("./src/lab42/pointXSL.xsl"));
        Templates templates = transformerFactory.newTemplates(streamSource);
        Transformer transformer = templates.newTransformer();
        transformer.transform(new StreamSource(new File("./src/lab42/point.xml")),
                new StreamResult(new FileOutputStream(new File("./src/lab42/Hello.html"))));


    }


}
