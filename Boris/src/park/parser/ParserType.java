package park.parser;


import park.parser.dom.DOMParser;
//import park.parser.sax.SAXParser;
//import park.parser.stax.StAXParser;

public enum ParserType {
    DOM {
        @Override
        public Parser getParser() {
            return new DOMParser();
        }
//    },
//    SAX {
//        @Override
//        public Parser getParser() {
//            return new SAXParser();
//        }
//    },
//
//    STAX {
//        @Override
//        public Parser getParser() {
//            return new StAXParser();
//        }
    };

    public abstract Parser getParser();
}
