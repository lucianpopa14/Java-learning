package src.main.mooc.part12;

import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (!hideout.isEmpty()) {
            hideout.clear();
        }
        hideout.add(toHide);
    }

    public T takeFromHideout() {
        T value = hideout.get(0);
        hideout.clear();
        return value;
    }

    public boolean isInHideout() {
        return !hideout.isEmpty();
    }

    public static void main(String[] args) {
        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
    }
}
