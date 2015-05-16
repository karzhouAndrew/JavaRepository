package pwt.classes;

/**
 * Created by asus on 15.05.2015.
 */
public abstract class Technics implements TechnicsBehavior {
    private String name;
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void changeOwner(String owner) {
        System.out.println("I change owner!");
    }

    @Override
    public abstract void repair();

    @Override
    public abstract void destruction();

    public void socketTurnOn(){
        System.out.println("Turn On");
    }
}
