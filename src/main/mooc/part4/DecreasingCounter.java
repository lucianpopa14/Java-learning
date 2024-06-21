package src.main.mooc.part4;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (value != 0) {
            value--;
        }
    }
    public void reset(){
        value = 0;
    }

}
