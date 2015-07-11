package park.plant.bush;


import park.plant.bush.bushes.Acacia;
import park.plant.bush.bushes.Barberry;
import park.plant.bush.bushes.Lilac;

public enum BushEnum {
    ACACIA {
        @Override
        public Bush getBush() {
            return new Acacia("Acacia", 0, 0);
        }
    },
    BARBERRY {
        @Override
        public Bush getBush() {
            return new Barberry("Barberry", 0, 0);
        }
    },
    LILAC {
        @Override
        public Bush getBush() {
            return new Lilac("Lilac", 0, 0);
        }
    };

    public abstract Bush getBush();
}
