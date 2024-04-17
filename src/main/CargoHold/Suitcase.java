package src.main.CargoHold;

import java.util.ArrayList;

public class Suitcase {
    int maximumWeight;
    int currentWeight;
    ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if (currentWeight + item.getWeight() <= maximumWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    public String toString() {
        if (items.size() == 0) {
            return "no items (" + currentWeight + " kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + currentWeight + ") kg";
        }
        return items.size() + " items (" + currentWeight + ") kg";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.getFirst();
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public int totalWeight() {
        return currentWeight;
    }

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
    }
}
