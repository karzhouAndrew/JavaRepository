package lab9JD9;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

/**
 * Created by PC on 24.06.2015.
 */
public class Main {
    public static void main(String[] args) throws TransformerException, FileNotFoundException {
        XMLTransformer transformer = new XMLTransformer();
        transformer.transform();
    }
}
