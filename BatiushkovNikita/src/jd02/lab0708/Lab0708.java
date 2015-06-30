package jd02.lab0708;

public class Lab0708 {
    private static final String PATH = "./BatiushkovNikita/src/jd02/lab04/Lab04.xml";

    public static void main(String[] args) {
        PointsList pointsList = new PointsList();
        Parser parser = ParserFactory.getParser(ParserType.DOM);
        parser.parsePoints(pointsList, PATH);
        pointsList.viewPoints();
    }
}