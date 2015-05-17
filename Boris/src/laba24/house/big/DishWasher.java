package laba24.house.big;

import laba24.house.BigAppliances;

//Стиральная машина
public class DishWasher extends BigAppliances {

    private int quantityThing;
    private final String START = "Wash dishes";

    public DishWasher(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, int weight, int quantityThing) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer, weight);
        this.quantityThing = quantityThing;
    }

    public DishWasher(int weight, int quantityThing) {
        super(weight);
        this.quantityThing = quantityThing;
    }

    public DishWasher(int quantityThing) {
        super();
        this.quantityThing = quantityThing;
    }

    public DishWasher(){
        this(0);
    }

    public boolean wash(String start){
        if (START.equalsIgnoreCase(start) && isSwitchOn) {
            return true;
        } else {
            return false;
        }
    }

    public int getQuantityThing() {
        return quantityThing;
    }

    public void setQuantityThing(int quantityThing) {
        this.quantityThing = quantityThing;
    }
}
