package laba24.house;

import laba24.HouseAppliances;

public abstract class MachineWorkingAppliance extends HouseAppliances {
    private String maxVelocity;

    public MachineWorkingAppliance(String brand, String price, boolean isTurnOn, String maxVelocity) {
        super(brand, price, isTurnOn);
        this.maxVelocity = maxVelocity;
    }

    public MachineWorkingAppliance(String brand, String maxVelocity) {
        super(brand);
        this.maxVelocity = maxVelocity;
    }

    public MachineWorkingAppliance(String brand, String price, boolean isTurnOn) {
        super(brand, price, isTurnOn);
    }

    public MachineWorkingAppliance(String brand) {
        super(brand);
    }

    public String getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(String maxVelocity) {
        this.maxVelocity = maxVelocity;
    }


}
