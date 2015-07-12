package park.parser.dom;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import park.parser.Parser;
import park.parser.Tags;
import park.plant.Plant;
import park.plant.bush.Bush;
import park.plant.bush.BushEnum;
import park.plant.tree.Tree;
import park.plant.tree.TreeEnum;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParser extends Parser {

    @Override
    public void parseXML(File file) throws FileNotFoundException {
        if (super.isXML(file)) {
            plants = getPlants(file);
            return;
        }
        throw new FileNotFoundException(file.getPath());
    }

    private List<Plant> getPlants(File file) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        builderFactory.setIgnoringElementContentWhitespace(true);
        Document document = null;
        try {
            document = builderFactory.newDocumentBuilder().parse(file);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getPlantsFromDocument(document);
    }

    private List<Plant> getPlantsFromDocument(Document document) {
        List<Plant> plants = new ArrayList<>();
        Element rootElement = document.getDocumentElement();
        NodeList childNodesBush = rootElement.getElementsByTagName(Tags.BUSH.toString().toLowerCase());
        for (int i = 0; i < childNodesBush.getLength(); i++) {
            Node node = childNodesBush.item(i);
            plants.add(createBush((Element) node));
        }
        NodeList childNodesTree = rootElement.getElementsByTagName(Tags.TREE.toString().toLowerCase());
        for (int i = 0; i < childNodesTree.getLength(); i++) {
            Node node = childNodesTree.item(i);
            plants.add(createBush((Element) node));
        }
        return plants;
    }

    private Plant createBush(Element element) {
        Bush bush = null;
        switch (BushEnum.valueOf(
                element.getElementsByTagName(Tags.SORT.toString().toLowerCase()).item(0).getTextContent())) {
            case ACACIA:
                bush = BushEnum.ACACIA.getBush();
                break;
            case BARBERRY:
                bush = BushEnum.BARBERRY.getBush();
                break;
            case LILAC:
                bush = BushEnum.LILAC.getBush();
                break;
            default:
                break;
        }
        if (bush != null) {
            setBushParametrs(bush, element);
        }
        return bush;
    }

    private void setBushParametrs(Bush bush, Element element) {
        bush.setThunksQuantity(Integer.parseInt(
                element.getElementsByTagName(Tags.THUNKSQUANTITY.toString().toLowerCase()).item(0).getTextContent()));
        bush.setHeight(Double.parseDouble(
                element.getElementsByTagName(Tags.HEIGHT.toString().toLowerCase()).item(0).getTextContent()));
    }

    private Plant createTree(Element element) {
        Tree tree = null;
        switch (TreeEnum.valueOf(
                element.getElementsByTagName(Tags.SORT.toString().toLowerCase()).item(0).getTextContent())) {
            case BIRCH:
                tree = TreeEnum.BIRCH.getTree();
                break;
            case MAPLE:
                tree = TreeEnum.MAPLE.getTree();
                break;
            case OAK:
                tree = TreeEnum.OAK.getTree();
                break;
            default:
                break;
        }
        if (tree != null) {
            setTreeParametrs(tree, element);
        }
        return tree;
    }

    private void setTreeParametrs(Tree tree, Element element) {
        tree.setThickness(Integer.parseInt(
                element.getElementsByTagName(Tags.THUNKSQUANTITY.toString().toLowerCase()).item(0).getTextContent()));
        tree.setHeight(Double.parseDouble(
                element.getElementsByTagName(Tags.HEIGHT.toString().toLowerCase()).item(0).getTextContent()));
    }


}
