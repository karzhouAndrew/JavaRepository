package module2.laba7.other;


public enum Tags {
    POINTLIST {
        @Override
        public String getName() {
            return "pointlist";
        }
    },
    POINT {
        @Override
        public String getName() {
            return "point";
        }
    },
    UNITS {
        @Override
        public String getName() {
            return "units";
        }
    },
    X {
        @Override
        public String getName() {
            return "x";
        }
    },
    Y {
        @Override
        public String getName() {
            return "y";
        }
    };

    public abstract String getName();
}
