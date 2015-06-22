package jd02.lab0708;

public class ParserFactory {
    public static Parser getParser(ParserType parserType) {
        return parserType.createParser();
    }
}
