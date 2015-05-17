package laba24.house;

import laba24.HouseAppliances;

//Крупногабаритная бытовая техника
public abstract class BigAppliances extends HouseAppliances {
    protected int weight;

    public BigAppliances(boolean isTurnOn, int frequencyUseInMonth,String manufacturer, int weight) {
        super(isTurnOn, frequencyUseInMonth, manufacturer);
        this.weight = weight;
    }

    public BigAppliances(int weight) {
        super();
        this.weight = weight;
    }

    public BigAppliances() {
        this(-1);
    }
}
