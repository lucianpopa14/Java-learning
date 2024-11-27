package mooc.part11.application;

public class StandardSensor implements Sensor{
    private int value;
    private boolean state;

    public StandardSensor(int value) {
        this.value = value;
        this.state = true;
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

    }

    @Override
    public int read() {
        return value;
    }

}
