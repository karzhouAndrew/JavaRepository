package jd02park;

import jd02park.entity.Plant;
import jd02park.parser.Tags;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class XMLCreator {

    private final String NS_URI = "http://www.it-academy.by";
    private final String NS_PREFIX = "it";
    private final String SCHEMA_URI = "http://www.w3.org/2001/XMLSchema-instance";
    private final String SCHEMA_ATTR = "schemaLocation";
    private final String SCHEMA_PREFIX = "xsi";
    private final String SCHEMA_ATTR_VALUE = "http://www.it-academy.by plantsListScheme.xsd";
    private final int HEIGHT_FRACTION_DIGITS = 2;

    public void exportPlantListToXML(List<Plant> parkPlants, String outputXmlFilePath) {
        Document document = buildDocument();
        Element rootElement = appendRoot(document);
        appendParkPlants(parkPlants, document, rootElement);
        appendTotals(parkPlants, document, rootElement);
        writeDOMToXML(document, outputXmlFilePath);
    }

    private Document buildDocument() {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = builderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.err.println("Error during configuration");
            e.printStackTrace();
        }
        return documentBuilder.newDocument();
    }

    private Element appendRoot(Document document) {
        Element rootElement = document.createElementNS(NS_URI, Tags.PLANTSLIST.getName());
        Attr attr = document.createAttributeNS(SCHEMA_URI, SCHEMA_ATTR);
        attr.setPrefix(SCHEMA_PREFIX);
        attr.setValue(SCHEMA_ATTR_VALUE);
        rootElement.setAttributeNodeNS(attr);
        rootElement.setPrefix(NS_PREFIX);
        document.appendChild(rootElement);
        return rootElement;
    }

    private void appendParkPlants(List<Plant> parkPlants, Document document, Element rootElement) {
        for (Plant plant : parkPlants) {
            Element plantElement = document.createElementNS(NS_URI, plant.getKind().getTag().getName());
            plantElement.setPrefix(NS_PREFIX);
            Element kindElement = document.createElementNS(NS_URI, Tags.KIND.getName());
            kindElement.setPrefix(NS_PREFIX);
            kindElement.appendChild(document.createTextNode(plant.getKind().getName()));
            plantElement.appendChild(kindElement);
            Element heightElement = document.createElementNS(NS_URI, Tags.HEIGHT.getName());
            heightElement.setPrefix(NS_PREFIX);
            double roundingNumber = Math.pow(10, HEIGHT_FRACTION_DIGITS);
            double formattedHeight = Math.round(plant.getHeight() * roundingNumber) / roundingNumber;
            heightElement.appendChild(document.createTextNode(Double.toString(formattedHeight)));
            plantElement.appendChild(heightElement);
            rootElement.appendChild(plantElement);
        }
    }

    private void appendTotals(List<Plant> parkPlants, Document document, Element rootElement) {
        Element totalElement = document.createElementNS(NS_URI, Tags.TOTALTRANSPLANTDATA.getName());
        totalElement.setPrefix(NS_PREFIX);
        Element overallElement = document.createElementNS(NS_URI, Tags.OVERALLQUANTITY.getName());
        overallElement.setPrefix(NS_PREFIX);
        overallElement.appendChild(document.createTextNode(Integer.toString(parkPlants.size())));
        totalElement.appendChild(overallElement);
        Element summaryElement = document.createElementNS(NS_URI, Tags.SUMMARYHEIGHT.getName());
        summaryElement.setPrefix(NS_PREFIX);
        String summaryHeight = Double.toString(ParkTask.calculateSummaryHeight(parkPlants));
        summaryElement.appendChild(document.createTextNode(summaryHeight));
        totalElement.appendChild(summaryElement);
        rootElement.appendChild(totalElement);
    }

    private void writeDOMToXML(Document document, String outputXmlFilePath) {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        try (Writer writer = new BufferedWriter(new FileWriter(outputXmlFilePath))) {
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(writer);
            transformer.transform(source, result);
        } catch (TransformerConfigurationException e) {
            System.err.println("Exception occurred while Transformer creation");
            e.printStackTrace();
        } catch (TransformerException e) {
            System.err.println("Exception while transforming");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Exception while working with file " + outputXmlFilePath);
            e.printStackTrace();
        }
    }
}