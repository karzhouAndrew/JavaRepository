package module2.laba7.parser;


import module2.laba7.parser.dom.DOMParser;
import module2.laba7.parser.sax.SAXParser;
import module2.laba7.parser.stax.StAXParser;

public enum ParserType {
    DOM {
        @Override
        public Parser getParser() {
            return new DOMParser();
        }
    },
    SAX {
        @Override
        public Parser getParser() {
            return new SAXParser();
        }
    },

    STAX {
        @Override
        public Parser getParser() {
            return new StAXParser();
        }
    };

    public abstract Parser getParser();
}
