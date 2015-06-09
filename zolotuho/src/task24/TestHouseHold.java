package task24;

public class TestHouseHold {

    public static void main(String[] args) {

        TypeSurface typeSurface = TypeSurface.CERAMIC;
        ProcessMode processMode = ProcessMode.FAST;
        HouseHold fridge = new Fridge("jqwh1111", "Samsung", 1, 2, 3, 4, 5);
        ControlTemperature controlTemperature = new Fridge("jqwh333", "LG", 1, 2, 3, 4, 5);
        //ControlTemperature controlTemperature11 = new ElectricCooker(1000, typeSurface);
        HouseHold fridge1 = new Fridge("jqwh2222", "Bosh", 1, 2, 3, 4, 5);
        HouseHold electricCooker = new ElectricCooker(1000, typeSurface.METAL, 300);
        HouseHold iron = new Iron(5, 2, typeSurface.CERAMIC, processMode.SLOW);
        HouseHold houseHold;
        houseHold = electricCooker;
        houseHold.showState();
        ((ElectricCooker) houseHold).increaseByOneDegree();
        houseHold.switchOn();
        houseHold.showState();
        houseHold = fridge1;
        houseHold.showState();
        houseHold.switchOn();
        houseHold.showState();
        houseHold = fridge;
        houseHold.showState();
        houseHold = fridge1;
        houseHold.showState();
        ((Fridge) houseHold).increaseByOneDegree();
        ((Fridge) houseHold).increaseByOneDegree();
        for (int i = 0; i < 6; i++) {
            ((Fridge) houseHold).increaseByOneDegree();
        }
        if (((Fridge) houseHold).warningInformation()) {
            System.out.println("Fridge is unfrozen");
        } else {
            System.out.println("Fridge is frozen ");
        }
        houseHold = electricCooker;
        for (int i = 0; i < 300; i++) {
            ((ElectricCooker) houseHold).increaseByOneDegree();
        }
        if (((ElectricCooker) houseHold).warningInformation()) {
            System.out.println("ElectricCooker overheated");
        } else {
            System.out.println("ElectricCooker is normal");
        }
    }
}
