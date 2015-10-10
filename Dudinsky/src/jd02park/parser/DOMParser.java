package jd02park.parser;

import jd02park.entity.Plant;
import jd02park.entity.PlantFactory;
import jd02park.entity.PlantKindEnum;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DOMParser implements Parser {
    @Override
    public List<Plant> displantParkFromXML(String inputXmlFilePath) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setIgnoringElementContentWhitespace(true);
        builderFactory.setNamespaceAware(true);
        Document document = null;
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(inputXmlFilePath))) {
            document = builderFactory.newDocumentBuilder().parse(inputStream);
        } catch (ParserConfigurationException e) {
            System.err.println("Error during configuration parser");
            e.printStackTrace();
        } catch (SAXException e) {
            System.err.println("Error occurred during parsing XML");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Exception while working with file " + inputXmlFilePath);
            e.printStackTrace();
        }
        return doParsing(document);
    }

    private List<Plant> doParsing(Document document) {
        List<Plant> plantsList = new ArrayList<>();
        Element plantsListRoot = document.getDocumentElement();
        addAllPlantsByTagName(plantsList, plantsListRoot, Tags.TREE.getName());
        addAllPlantsByTagName(plantsList, plantsListRoot, Tags.SHRUB.getName());
        return plantsList;
    }

    private void addAllPlantsByTagName(List<Plant> plantsList, Element plantsListRoot, String name) {
        NodeList currentPlantNodes = plantsListRoot.getElementsByTagNameNS(plantsListRoot.getNamespaceURI(), name);
        for (int i = 0; i < currentPlantNodes.getLength(); i++) {
            Node currentPlantNode = currentPlantNodes.item(i);
            plantsList.add(createPlant(currentPlantNode));
        }
    }

    private Plant createPlant(Node plantNode) {
        NodeList kindNodes = ((Element) plantNode).getElementsByTagNameNS(plantNode.getNamespaceURI(), Tags.KIND.getName());
        PlantKindEnum currentPlantKind = PlantKindEnum.valueOf(kindNodes.item(0).getTextContent().toUpperCase());
        NodeList heightNodes = ((Element) plantNode).getElementsByTagNameNS(plantNode.getNamespaceURI(), Tags.HEIGHT.getName());
        double currentPlantHeight = Double.parseDouble(heightNodes.item(0).getTextContent());
        return PlantFactory.getPlant(currentPlantKind, currentPlantHeight);
    }
}
