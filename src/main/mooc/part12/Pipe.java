package src.main.mooc.part12;

import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null;
        }
        T value = pipe.getFirst();
        pipe.removeFirst();
        return value;
    }


    public boolean isInPipe() {
        if (pipe.isEmpty()) {
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }

}
