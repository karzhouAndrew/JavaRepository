package park.parser;


import park.plant.Plant;

import java.util.List;

public interface Parser {
    String XML_FILE_NAME = "AlexWinitsky/src/park/plant.xml";

    public List<Plant> parser();
}
