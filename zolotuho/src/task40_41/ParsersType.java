package task40_41;

public enum ParsersType {
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
    };

    public abstract Parser makeParser();
}
