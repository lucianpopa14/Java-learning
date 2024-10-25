package src.main.mooc.part9.InterfaceInABox;

import java.util.ArrayList;

public class Box {
    private double maxCapacity;
    private ArrayList<Packable> boxContents;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.boxContents = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item.weight() < maxCapacity) {
            if (totalWeight(boxContents) < maxCapacity) {
                boxContents.add(item);
            }
        }
    }

    public double totalWeight(ArrayList<Packable> boxContents) {
        double totalWeight = 0;
        for (Packable item : boxContents) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + boxContents.size() + " items, total weight "
                + totalWeight(boxContents) + " kg";
    }
}
