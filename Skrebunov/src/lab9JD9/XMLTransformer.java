package lab9JD9;

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by PC on 24.06.2015.
 */
public class XMLTransformer {
    public void transform() throws TransformerException, FileNotFoundException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource streamSource = new StreamSource(new File(".\\Skrebunov\\src\\lab9JD2\\pl.xsl"));
        Templates templates = transformerFactory.newTemplates(streamSource);
        Transformer transformer = templates.newTransformer();
        transformer.transform(new StreamSource(new File(".\\Skrebunov\\src\\lab9JD2\\pl.xml")),
                new StreamResult(new FileOutputStream(new File(".\\Skrebunov\\src\\lab9JD2\\pl.html"))));
    }
}
