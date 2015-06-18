package lab9jd2;


import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XMLTransformer {
    public void transformToHTML(String nameXMLFile, String nameXSLFile, String nameHTMLFile) {
        try {
            StreamSource streamSource = new StreamSource(new File(nameXSLFile));
            Transformer transformer = TransformerFactory.newInstance().newTemplates(streamSource).newTransformer();
            transformer.transform(new StreamSource(new File(nameXMLFile)), new StreamResult(new FileOutputStream(new File(nameHTMLFile))));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
