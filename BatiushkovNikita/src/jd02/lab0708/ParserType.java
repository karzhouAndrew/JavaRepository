package jd02.lab0708;

public enum ParserType {
    DOM {
        public Parser createParser() {
            return new DOMParser();
        }
    },
    STAX {
        public Parser createParser() {
            return new STAXParser();
        }
    };

    public abstract Parser createParser();
}
