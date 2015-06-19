package module2.laba7;


public enum Tags {
    POINT {
        @Override
        String getName() {
            return "point";
        }
    },
    UNITS {
        @Override
        String getName() {
            return "units";
        }
    },
    X {
        @Override
        String getName() {
            return "x";
        }
    },
    Y {
        @Override
        String getName() {
            return "y";
        }
    };

    abstract String getName();
}
