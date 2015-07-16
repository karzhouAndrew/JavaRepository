package add11;

public class ParserFactory {

    public static Parser getParser(ParserEnum parserType) {
        switch (parserType) {
            case DOM:
                return new ParserDOM();
            case STAX:
                return new StAXParser();
            case SAX:
                return new SAXParser();
            default:
                throw new IllegalArgumentException("Such parser's type doesn't exist");
        }
    }
}
