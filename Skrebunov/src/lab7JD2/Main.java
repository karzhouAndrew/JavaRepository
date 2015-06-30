package lab7JD2;

/**
 * Created by PC on 24.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        DOMParser parser = new DOMParser();
        PointList pointList = parser.parseXML();
        System.out.println(pointList);
    }
}
