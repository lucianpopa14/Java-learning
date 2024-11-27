package mooc.part6.cargohold;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int weight = 0;
        for (Item i : items) {
            weight += i.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);

        for (Item i : items) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }

        }
        return heaviest;

    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + totalWeight() + "kg )";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + "kg )";
        } else return items.size() + " items (" + totalWeight() + "kg )";
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
