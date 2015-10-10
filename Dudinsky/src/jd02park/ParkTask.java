package jd02park;

/* Задание по XML/Parsers "Парк":
Импортировать из XML-файла информацию о парковых растениях.
Определить иерархию деревьев и кустарников. Посадить парк.
Посчитать число насаждений и их общую высоту.
Результаты экспортировать в XML-файл.
ТРЕБОВАНИЯ:
1.	Парсинг XML-документов осуществлять КАЖДЫМ из парсеров: DOM, SAX или StAX.
2.	При кодировании должны быть использованы соглашения об оформлении кода для соответствующего языка – code convention.
3.	Грамотно использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
4.	Не использовать графический интерфейс! Приложение должно быть консольным.
5.	Взаимодействие с консолью или консольное меню должно отсутствовать или быть минимальным.
6.	На интервью приносить на флеш-носителе исходный код.
7.	(*) По возможности использовать design patterns GoF, но если не сможете объяснить детали применения, то лучше обойтись без них. */

import jd02park.entity.Plant;
import jd02park.parser.Parser;
import jd02park.parser.ParserFactory;
import jd02park.parser.ParsersTypeEnum;

import java.util.List;

public class ParkTask {

    private static final String INPUT_XML_FILE_PATH = "./Dudinsky/src/jd02park/plantsList.xml";
    private static final String OUTPUT_XML_FILE_PATH = "./Dudinsky/src/jd02park/resultPlantsList.xml";
    private static List<Plant> parkPlants;

    public static void main(String[] args) {
        displantParkByEveryParser(INPUT_XML_FILE_PATH);
        cultivatePark(parkPlants);
        XMLCreator xmlCreator = new XMLCreator();
        xmlCreator.exportPlantListToXML(parkPlants, OUTPUT_XML_FILE_PATH);
    }

    private static void displantParkByEveryParser(String inputXmlFilePath) {
        for (ParsersTypeEnum currentParserType : ParsersTypeEnum.values()) {
            System.out.println("currentParserType = " + currentParserType);
            Parser currentParser = ParserFactory.getParser(currentParserType);
            parkPlants = currentParser.displantParkFromXML(inputXmlFilePath);
            System.out.println("overallQuantity = " + parkPlants.size() + "\n------------------------------------------");
        }
    }

    private static void cultivatePark(List<Plant> parkPlants) {
        System.out.println("summaryHeight = " + calculateSummaryHeight(parkPlants));
        fertilizedYearParkGrow(parkPlants);
        System.out.println("After fertilization and a year of growth: summaryHeight = " + calculateSummaryHeight(parkPlants));
        yearParkGrow(parkPlants);
        System.out.println("After second year: summaryHeight = " + calculateSummaryHeight(parkPlants));
    }

    private static void yearParkGrow(List<Plant> parkPlants) {
        for (Plant plant : parkPlants) {
            plant.growPerYear();
        }
    }

    private static void fertilizedYearParkGrow(List<Plant> parkPlants) {
        for (Plant plant : parkPlants) {
            plant.fertilize();
            plant.growPerYear();
        }
    }

    public static double calculateSummaryHeight(List<Plant> parkPlants) {
        double summaryHeight = .0;
        for (Plant plant : parkPlants) {
            summaryHeight += plant.getHeight();
        }
        return summaryHeight;
    }
}
