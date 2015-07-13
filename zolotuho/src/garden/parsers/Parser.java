package garden.parsers;

import garden.plants.Plant;

import java.io.File;
import java.util.List;

public interface Parser {
    List<Plant> parseXMLFile(File path);
}
