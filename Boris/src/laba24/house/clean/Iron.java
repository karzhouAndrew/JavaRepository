package laba24.house.clean;

import laba24.house.AppliancesForHimself;

//Утюг
public class Iron extends AppliancesForHimself {

    private String clothes;

    public Iron(boolean isSwitchOn, int frequencyUseInMonth, String manufacturer, String clothes) {
        super(isSwitchOn, frequencyUseInMonth, manufacturer);
        this.clothes = clothes;
    }

    public Iron(String cleaningThing, String clothes) {
        super(cleaningThing);
        this.clothes = clothes;
    }

    public Iron(String clothes) {
        super();
        this.clothes = clothes;
    }

    public Iron (){
        this("Nothing");
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }
}
