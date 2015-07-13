package garden.parsers;


import garden.parsers.impl.DOMParser;
import garden.parsers.impl.SAXParser;
import garden.parsers.impl.StAXParser;

public enum ParserType {
    DOM {
        @Override
        public Parser makeParser() {
            return new DOMParser();
        }
    }, STAX {
        @Override
        public Parser makeParser() {
            return new StAXParser();
        }
    }, SAX {
        @Override
        public Parser makeParser() {
            return new SAXParser();
        }
    };

    public abstract Parser makeParser();
}
