package src.main.mooc.part11.application;

public interface Sensor {
    boolean isOn();

    void setOn();

    void setOff();

    int read();
}