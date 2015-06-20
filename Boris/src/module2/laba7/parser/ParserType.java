package module2.laba7.parser;


import module2.laba7.parser.Parser;
import module2.laba7.parser.dom.DOMParser;

public enum ParserType {
    DOM {
        @Override
        Parser getParser() {
            return new DOMParser();
        }
    },
    SAX {
        @Override
        Parser getParser() {
            return null;
        }
    },

    STAX {
        @Override
        Parser getParser() {
            return null;
        }
    };

    abstract Parser getParser();
}
