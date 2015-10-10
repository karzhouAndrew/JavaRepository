package park.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;

public class ResultXML {
    public Document documentBuilder() {
        DocumentBuilderFactory documentBuilderFactory =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder =
                    documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return documentBuilder.newDocument();
    }

    public ResultXML() {
    }

    public ResultXML(int numberPlants, double totalHeight) {
        createXML(documentBuilder(), numberPlants, totalHeight);
    }

    public void createXML(Document document, int numberPlants, double totalHeight) {
        String root = "result";
        Element rootElement = document.createElement(root);
        document.appendChild(rootElement);
        for (int i = 0; i < 1; i++) {

            Element emNumberPlants = document.createElement("numberPlants");
            int number = numberPlants;
            emNumberPlants.appendChild(document.createTextNode(String.valueOf(number)));

            Element emHeight = document.createElement("totalHeight");
            emHeight.appendChild(document.createTextNode(String.valueOf(totalHeight)));
            rootElement.appendChild(emNumberPlants);
            rootElement.appendChild(emHeight);
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileWriter("AlexWinitsky/src/park/result.xml"));
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



