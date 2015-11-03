package jd02park.parser;

import jd02park.entity.Plant;

import java.util.List;

public interface Parser {

    List<Plant> displantParkFromXML(String inputXmlFilePath);
}
