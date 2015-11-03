package jd02park.parser;

public enum Tags {
    PLANTSLIST {
        @Override
        public String getName() {
            return "plantsList";
        }
    },
    TREE {
        @Override
        public String getName() {
            return "tree";
        }
    },
    SHRUB {
        @Override
        public String getName() {
            return "shrub";
        }
    },
    KIND {
        @Override
        public String getName() {
            return "kind";
        }
    },
    HEIGHT {
        @Override
        public String getName() {
            return "height";
        }
    },
    TOTALTRANSPLANTDATA {
        @Override
        public String getName() {
            return "totalTransplantData";
        }
    },
    OVERALLQUANTITY {
        @Override
        public String getName() {
            return "overallQuantity";
        }
    },
    SUMMARYHEIGHT {
        @Override
        public String getName() {
            return "summaryHeight";
        }
    };

    public abstract String getName();
}
