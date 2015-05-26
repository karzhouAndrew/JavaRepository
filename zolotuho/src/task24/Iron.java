package task24;

public class Iron extends SmallHouseHold {
   private TypeSurface typeSurface;
   private ProcessMode processMode;

    public Iron(double weight, double lengthOfCord, TypeSurface typeSurface, ProcessMode processMode) {
        super(weight, lengthOfCord);
        this.typeSurface = typeSurface;
        this.processMode = processMode;
    }

    @Override
    public void showState() {
        if (state) {
            System.out.println("Iron switched On");
        } else {
            System.out.println("Iron switched off");
        }
    }

    public TypeSurface getTypeSurface() {
        return typeSurface;
    }

    public void setTypeSurface(TypeSurface typeSurface) {
        this.typeSurface = typeSurface;
    }

    public ProcessMode getProcessMode() {
        return processMode;
    }

    public void setProcessMode(ProcessMode processMode) {
        this.processMode = processMode;
    }

    public void switchOn() {
        state = true;
        this.processMode = processMode.SLOW;
    }

    public void switchOff() {
        state = false;
    }
}
