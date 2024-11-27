package mooc.part5;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value += 1;
    }

    public void decrease() {
        value -= 1;
    }
    public void increase(int increaseBy){
        value += increaseBy;
    }
    public void decrease(int decreaseBy){
        value += decreaseBy;
    }
}
