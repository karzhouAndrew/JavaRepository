package garden;

import garden.parsers.Parser;
import garden.parsers.ParserType;
import garden.plants.Bush;
import garden.plants.Plant;
import garden.xmlWriterTools.PlantCatalog;
import garden.xmlWriterTools.XMLWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//Импортировать из XML-файла информацию о парковых растениях.
//Определить иерархию деревьев и кустарников. Посадить парк.
//Посчитать число насаждений и их общую высоту.
//Результаты экспортировать в XML-файл.

public class TestGarden {
    public static void main(String[] args) {
        File path = new File("./src/garden/garden.xml");
        String outSmallPantsFilePath = "./src/garden/outGarden.xml";
        String outAllPantsFilePath = "./src/garden/fullOutGarden.xml";
        System.out.println("DOM:");
        Parser parser = ParserType.DOM.makeParser();
        List<Plant> plants = parser.parseXMLFile(path);
        for (Plant plant : plants) {
            System.out.println(plant);
        }
        plants.clear();
        System.out.println("StAX:");
        parser = ParserType.STAX.makeParser();
        plants = parser.parseXMLFile(path);
        for (Plant plant : plants) {
            System.out.println(plant);
        }
        plants.clear();
        System.out.println("SAX:");
        parser = ParserType.SAX.makeParser();
        plants = parser.parseXMLFile(path);
        for (Plant plant : plants) {
            System.out.println(plant);
        }
        List<Plant> smallPlants = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            smallPlants.add(new Bush("currant", 0, 1, 1));
        }

        for (Plant smallPlant : smallPlants) {
            smallPlant.grow();
            smallPlant.grow();
        }

        PlantCatalog catalog = new PlantCatalog();
        catalog.add(plants);
        catalog.add(smallPlants);
        System.out.print("Total height :");
        System.out.println(catalog.calculateTotalHeight());
        System.out.print("Total quantity :");
        System.out.println(catalog.calculateTotalQuantity());
        XMLWriter xmlWriter = new XMLWriter();
        xmlWriter.write(smallPlants, outSmallPantsFilePath);
        xmlWriter.write(catalog, outAllPantsFilePath);
    }
}


