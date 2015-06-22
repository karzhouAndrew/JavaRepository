package module2.laba9;


import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

public class TestTransformation {
    public static void main(String[] args) throws TransformerException, FileNotFoundException {
        TransformXMLtoXSLT transformer = new TransformXMLtoXSLT();
        transformer.transform("Boris/src/module2/laba9/PointListXSD.xml",
                "./Boris/src/module2/laba9/PointListToHTML.xsl");
    }
}
