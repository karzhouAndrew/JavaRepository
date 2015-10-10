package park;

import park.parser.Parser;
import park.parser.ParserFactory;
import park.parser.ParsersTypeEnum;
import park.parser.ResultXML;
import park.plant.Bush;
import park.plant.ParkInformation;
import park.plant.Plant;
import park.plant.Tree;

import java.util.ArrayList;

/**
 XML/Parsers
 Парк

 Импортировать из XML-файла информацию о парковых растениях.
 Определить иерархию деревьев и кустарников. Посадить парк.
 Посчитать число насаждений и их общую высоту.
 Результаты экспортировать в XML-файл.

 */
public class RunParsers {
    public static void main(String[] args) {

        String typeParse="SAX";
        Parser parser = ParserFactory.getParser(ParsersTypeEnum.valueOf(typeParse));
        ArrayList<Plant> listPlants= (ArrayList<Plant>) (parser.parser());

        listPlants.add(new Tree("Персик",1.8,40,0.3));
        listPlants.add(new Tree("Абрикос",1.7,50,0.4));
        listPlants.add(new Bush("Ежевика",1,20,0.3,1));

        ParkInformation parkInformation = new ParkInformation();

        double totalHeight=parkInformation.calculateHeightPlants(listPlants);
        int numberPlants=parkInformation.calculateTrees(listPlants)+parkInformation.calculateBushes(listPlants);
        new ResultXML(numberPlants,totalHeight);

        System.out.println("Список деревьев в парке ");
        parkInformation.printListPalnt(listPlants);

        System.out.println("\n"+"Количество деревьев в парке " + parkInformation.calculateTrees(listPlants));
        System.out.println("Количество кустов в парке " + parkInformation.calculateBushes(listPlants));
        System.out.println("Общая выстота деревьев и кустарников в парке " + parkInformation.calculateHeightPlants(listPlants));

        for (Plant plant:listPlants){
            plant.grow(5);
        }
        System.out.println();

        System.out.println("Список деревьев в парке ");
        parkInformation.printListPalnt(listPlants);

        System.out.println("\n"+"Количество деревьев в парке " + parkInformation.calculateTrees(listPlants));
        System.out.println("Количество кустов в парке " + parkInformation.calculateBushes(listPlants));
        System.out.println("Общая выстота деревьев и кустарников в парке " + parkInformation.calculateHeightPlants(listPlants));

    }
}
