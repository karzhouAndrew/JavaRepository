package task24;


public interface ControlTemperature {

    void setTemperature(double temperature);

    void setTemperature(double temperature, double temperature1);

    void increaseByOneDegree();

    void decreaseByOneDegree();

    boolean warningInformation();

}

