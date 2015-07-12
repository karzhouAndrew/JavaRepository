package lab42;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

public class TransformerTest {
    public static void main(String[] args) throws TransformerException, FileNotFoundException {

        String XSL_File = "tikhomirov\\src\\lab42\\example.xsl";
        String XML_File = "tikhomirov\\src\\lab42\\example.xml";

        Transformer transformer = new Transformer();
        transformer.transform(XSL_File, XML_File);
    }
}
