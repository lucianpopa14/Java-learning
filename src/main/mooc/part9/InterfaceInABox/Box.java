package src.main.mooc.part9.InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> boxContents;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.boxContents = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item.weight() < maxCapacity) {
            if (weight(boxContents) < maxCapacity) {
                boxContents.add(item);
            }
        }
    }

    public double weight (ArrayList<Packable> boxContents) {
        double weight  = 0;
        for (Packable item : boxContents) {
            weight  += item.weight();
        }
        return weight ;
    }

    @Override
    public String toString() {
        return "Box: " + boxContents.size() + " items, total weight "
                + weight (boxContents) + " kg";
    }

    @Override
    public double weight() {
        return 0;
    }
}
