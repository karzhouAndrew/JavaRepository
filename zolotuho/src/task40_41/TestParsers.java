package task40_41;

import java.io.File;

public class TestParsers {
    public static void main(String[] args) {
        File path = new File("./src/task40_41/pointsList.xml");
        System.out.println("DOM:");
        Parser parser = ParsersType.DOM.makeParser();
        PointsList points = parser.parseXMLFile(path);
        points.printPoints();
        System.out.println("StAX:");
        parser = ParsersType.STAX.makeParser();
        points = parser.parseXMLFile(path);
        points.printPoints();
    }
}
