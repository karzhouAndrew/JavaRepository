package module2.laba9;

//Напишите программу, преобразующую созданный в предыдущих за-даниях xml файл в html, аналогично
// данному примеру, в каждой ячейке дополнительно к координате должны выводиться единицы измерения.
// Результат должен записываться в файл на диске.

import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TransformXMLtoXSLT {
    public void transform(String xmlPath, String xslPath) throws TransformerException, FileNotFoundException {
        File xmlFile = new File(xmlPath);
        if (xmlFile.getName().endsWith(".xml$")) {
            throw new IllegalArgumentException(" Not \".xml\" file.");
        }
        File xslFile = new File(xslPath);
        if (xslFile.getName().endsWith(".xsl$")) {
            throw new IllegalArgumentException(" Not \".xsl\" file.");
        }
        if (xmlFile.exists()) {
            if (xslFile.exists()) {
                createHTML(xmlFile, xslFile);
            } else {
                throw new FileNotFoundException(xslPath);
            }
        } else {
            throw new FileNotFoundException(xmlPath);
        }
    }

    private void createHTML(File xmlFile, File xslFile) throws TransformerException, FileNotFoundException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource streamSource = new StreamSource(xslFile);
        Templates templates = transformerFactory.newTemplates(streamSource);
        Transformer transformer = templates.newTransformer();
        transformer.transform(new StreamSource(xmlFile), new StreamResult(new FileOutputStream(new File(
                xmlFile.getPath().substring(0, xmlFile.getPath().length() - 3) + "html"))));
    }

}
