package jd02park.entity;

import jd02park.parser.Tags;

public enum PlantKindEnum {
    OAK(.1) {
        @Override
        public Plant createPlant(PlantKindEnum plantKind, double plantHeight) {
            return new Tree(plantKind, plantHeight);
        }

        @Override
        public Tags getTag() {
            return Tags.TREE;
        }
    },
    BIRCH(.15) {
        @Override
        public Plant createPlant(PlantKindEnum plantKind, double plantHeight) {
            return new Tree(plantKind, plantHeight);
        }

        @Override
        public Tags getTag() {
            return Tags.TREE;
        }
    },
    MAPLE(.2) {
        @Override
        public Plant createPlant(PlantKindEnum plantKind, double plantHeight) {
            return new Tree(plantKind, plantHeight);
        }

        @Override
        public Tags getTag() {
            return Tags.TREE;
        }
    },
    BRIER(.05) {
        @Override
        public Plant createPlant(PlantKindEnum plantKind, double plantHeight) {
            return new Shrub(plantKind, plantHeight);
        }

        @Override
        public Tags getTag() {
            return Tags.SHRUB;
        }
    },
    LILAC(.1) {
        @Override
        public Plant createPlant(PlantKindEnum plantKind, double plantHeight) {
            return new Shrub(plantKind, plantHeight);
        }

        @Override
        public Tags getTag() {
            return Tags.SHRUB;
        }
    },
    JASMINE(0.05) {
        @Override
        public Plant createPlant(PlantKindEnum plantKind, double plantHeight) {
            return new Shrub(plantKind, plantHeight);
        }

        @Override
        public Tags getTag() {
            return Tags.SHRUB;
        }
    };

    private double averageAnnualGrowth;

    PlantKindEnum(double averageAnnualGrowth) {
        this.averageAnnualGrowth = averageAnnualGrowth;
    }

    public abstract Plant createPlant(PlantKindEnum plantKind, double plantHeight);

    public abstract Tags getTag();

    public String getName() {
        return this.name().substring(0, 1) + this.name().substring(1).toLowerCase();
    }

    public double getAverageAnnualGrowth() {
        return averageAnnualGrowth;
    }
}
