package garden.parsers.impl;


import garden.parsers.Parser;
import garden.plants.Bush;
import garden.plants.Plant;
import garden.plants.Tree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParser implements Parser {

    @Override
    public List<Plant> parseXMLFile(File path) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        List<Plant> plants = new ArrayList<>();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(path);
            Element root = document.getDocumentElement();
            DOMParser parser = new DOMParser();
            plants = parser.doParse(root);
        } catch (ParserConfigurationException e) {
            System.out.println("Exception during configuration parser");
            e.printStackTrace();
        } catch (SAXException e) {
            System.out.println("Exception occurred during parsing");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return plants;
    }

    private List<Plant> doParse(Node root) {
        List<Plant> plants = new ArrayList<>();
        if (isPlants(root)) {
            if (root.hasChildNodes()) {
                NodeList plantsNodes = root.getChildNodes();
                for (int i = 0; i < plantsNodes.getLength(); i++) {
                    Node plantsNode = plantsNodes.item(i);
                    if (isTree(plantsNode)) {
                        plants.add(createTree(plantsNode));
                    }
                    if (isBush(plantsNode)) {
                        plants.add(createBush(plantsNode));
                    }
                }
            }
        }
        return plants;
    }

    private Tree createTree(Node node) {
        Tree tree = new Tree();
        if (node.hasChildNodes()) {
            NodeList treeNodes = node.getChildNodes();
            for (int i = 0; i < treeNodes.getLength(); i++) {
                fillPlantsAttributes(tree, treeNodes, i);
                if (isTrunkWidth(treeNodes.item(i))) {
                    tree.setTrunkWidth(Integer.parseInt(treeNodes.item(i).getTextContent()));
                }
            }
        }
        return tree;
    }

    private Bush createBush(Node node) {
        Bush bush = new Bush();
        if (node.hasChildNodes()) {
            NodeList bushNodes = node.getChildNodes();
            for (int i = 0; i < bushNodes.getLength(); i++) {
                fillPlantsAttributes(bush, bushNodes, i);
                if (isTrunkQuantity(bushNodes.item(i))) {
                    bush.setTrunksQuantity(Integer.parseInt(bushNodes.item(i).getTextContent()));
                }
            }
        }
        return bush;
    }


    private void fillPlantsAttributes(Plant plant, NodeList nodes, int i) {
        if (isName(nodes.item(i))) {
            plant.setName(nodes.item(i).getTextContent());
        }
        if (isAge(nodes.item(i))) {
            plant.setAge(Integer.parseInt(nodes.item(i).getTextContent()));
        }
        if (isHeight(nodes.item(i))) {
            plant.setHeight(Integer.parseInt(nodes.item(i).getTextContent()));
        }
    }

    private boolean isPlants(Node node) {
        return node.getNodeName().equals("plants");
    }

    private boolean isTree(Node node) {
        return node.getNodeName().equals("tree");
    }

    private boolean isBush(Node node) {
        return node.getNodeName().equals("bush");
    }

    private boolean isName(Node node) {
        return node.getNodeName().equals("name");
    }

    private boolean isAge(Node node) {
        return node.getNodeName().equals("age");
    }

    private boolean isHeight(Node node) {
        return node.getNodeName().equals("height");
    }

    private boolean isTrunkWidth(Node node) {
        return node.getNodeName().equals("trunkWidth");
    }

    private boolean isTrunkQuantity(Node node) {
        return node.getNodeName().equals("trunkQuantity");
    }
}
