package jd02park.parser;

public class ParserFactory {

    public static Parser getParser(ParsersTypeEnum parsersType) {
        return parsersType.createParser();
    }
}
