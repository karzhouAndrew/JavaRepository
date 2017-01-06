package add11;

import java.util.ArrayList;

/**
 * Created by Константин on 16.07.2015.
 */


public class Add11 {
    public static void main(String[] args) {
        String dom = "DOM";
        String sax = "SAX";
        String stax = "STAX";
        String typeParse = dom;
        Parser parser = ParserFactory.getParser(ParserEnum.valueOf(typeParse));
        ArrayList<Plant> Plants = (ArrayList<Plant>) (parser.parser());
        ProcessingGarden processingGarden = new ProcessingGarden();
        double totalHeight = processingGarden.calculateHeightPlants(Plants);
        int numberPlants = processingGarden.amountTrees(Plants) + processingGarden.amountBushes(Plants);
        new ResultXML(numberPlants, totalHeight);
        System.out.println("Список деревьев в парке ");
        processingGarden.printPlant(Plants);
        System.out.println("Количество деревьев в парке " + processingGarden.amountTrees(Plants));
        System.out.println("Количество кустов в парке " + processingGarden.amountBushes(Plants));
        System.out.println("Общая выстота деревьев и кустарников в парке " + processingGarden.calculateHeightPlants(Plants));
        for (Plant plant : Plants) {
            plant.grow(4);
        }
        System.out.println();
        System.out.println("Список деревьев в парке ");
        processingGarden.printPlant(Plants);
        System.out.println("Количество деревьев в парке " + processingGarden.amountTrees(Plants));
        System.out.println("Количество кустов в парке " + processingGarden.amountBushes(Plants));
        System.out.println("Общая выстота деревьев и кустарников в парке " + processingGarden.calculateHeightPlants(Plants));
    }
}

