package park;


import java.io.File;

public class TestPark {
    public static void main(String[] args) {
        Park park = new Park();
        File file = new File("Boris/src/park/xml/park.xml");
        park.growParkFromXML(file);
        System.out.println(park.seePlantsInPark());
        park.grow();
        System.out.println(park.seePlantsInPark());
    }

}
