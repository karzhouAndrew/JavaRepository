package laba24.house.big;

import laba24.house.BigAppliances;

//Эдектрическая плита
public class ElectricCooker extends BigAppliances {

    private int quantityCookingPlate;
    private final String START = "Warm up";

    public ElectricCooker(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, int weight, int quantityCookingPlate) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer, weight);
        this.quantityCookingPlate = quantityCookingPlate;
    }

    public ElectricCooker(int weight, int quantityCookingPlate) {
        super(weight);
        this.quantityCookingPlate = quantityCookingPlate;
    }

    public ElectricCooker(int quantityCookingPlate) {
        super();
        this.quantityCookingPlate = quantityCookingPlate;
    }

    public ElectricCooker() {
        this(0);
    }

    public boolean freeze(String start) {
        if (START.equalsIgnoreCase(start) && isSwitchOn) {
            return true;
        } else {
            return false;
        }
    }

    public int getQuantityCookingPlate() {
        return quantityCookingPlate;
    }

    public void setQuantityCookingPlate(int quantityCookingPlate) {
        this.quantityCookingPlate = quantityCookingPlate;
    }
}

