package mooc.part9.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public int currentAmount() {
        int sum = 0;

        for (Item e : items) {
            sum += e.getWeight();
        }
        return sum;

    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
