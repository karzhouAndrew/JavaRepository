package jd02.lab0708;

public class ParserFactory {
    public static Parser getParser(ParserType parserType) {
        switch (parserType) {
            case DOM:
                return new DOMParser();
            case STAX:
                return new STAXParser();
            default:
                throw new IllegalArgumentException();
        }
    }
}
