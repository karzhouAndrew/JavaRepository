package laba24.house.clean;

import laba24.house.AppliancesForHimself;

//Пылесос
public class Washer extends AppliancesForHimself {

    private String clothes;

    public Washer(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, String clothes) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer);
        this.clothes = clothes;
    }

    public Washer(String cleaningThing, String clothes) {
        super(cleaningThing);
        this.clothes = clothes;
    }

    public Washer(String clothes) {
        super();
        this.clothes = clothes;
    }

    public Washer (){
        this("Nothing");
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
}
