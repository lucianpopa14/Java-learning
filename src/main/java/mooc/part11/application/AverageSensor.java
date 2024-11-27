package mooc.part11.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList;
    private List<Integer> listOfAverage;


    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.listOfAverage = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean isOn = false;
        for (Sensor sensor : sensorList) {
            if (sensor.isOn()) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensorList) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensorList) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        if (isOn() && !sensorList.isEmpty()) {
            for (Sensor sensor : sensorList) {
                sum += sensor.read();
            }
            int average = sum / sensorList.size();
            listOfAverage.add(average);
            return average;
        } else {
            throw new IllegalArgumentException("error getting average of sensors");
        }
    }

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    }
}
