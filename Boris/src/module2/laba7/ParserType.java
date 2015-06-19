package module2.laba7;


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
