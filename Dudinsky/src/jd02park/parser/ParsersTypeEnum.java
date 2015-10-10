package jd02park.parser;

public enum ParsersTypeEnum {

    DOM {
        @Override
        public Parser createParser() {
            return new DOMParser();
        }
    },
    SAX {
        @Override
        public Parser createParser() {
            return new SAXParser();
        }
    },
    STAX {
        @Override
        public Parser createParser() {
            return new STAXParser();
        }
    };

    public abstract Parser createParser();
}
