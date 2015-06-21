package jd02.lab0708;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Lab0708 {
    private static final String PATH = "./BatiushkovNikita/src/jd02/lab04/Lab04.xml";

    public static void main(String[] args) {
        // DOM
        PointsList DOMPointsList = new PointsList();
        ParserDOM parserDOM = new ParserDOM();
        Document doc = parserDOM.getDocument(PATH);
        createPoints(DOMPointsList, doc);
        DOMPointsList.viewPoints();

        // STAX
        PointsList STAXPointsList = new PointsList();
        ParserSTAX parserSTAX = new ParserSTAX();
        parserSTAX.parseSTAX(STAXPointsList, PATH);
        STAXPointsList.viewPoints();
    }

    public static void createPoints(PointsList pointsList, Document doc) {
        NodeList nodeList = doc.getElementsByTagName("point");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            int x = Integer.parseInt(element.getElementsByTagName("x").item(0).getTextContent());
            int y = Integer.parseInt(element.getElementsByTagName("y").item(0).getTextContent());
            String unit = nodeList.item(i).getAttributes().item(0).getNodeValue();
            pointsList.addPoint(new Point(unit, x, y));
        }
    }
}
