package src.main.mooc.part11.application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private int value;
    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        state = true;
    }

    @Override
    public void setOff() {
        state = false;
    }

    @Override
    public int read() {
        if (!state) {
            throw new IllegalStateException("The sensor is off");
        }
        int valueToSet = new Random().nextInt(-30, 30);
        setValue(valueToSet);
        return valueToSet;
    }


    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.setOn();
        System.out.println(temperatureSensor.read());

    }
}
