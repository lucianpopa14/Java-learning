package src.main.Collections.TakeoutProject;

public class Food implements PricedItem<Integer> {
    private String name;
    private String description;
    private int price;

    public Food(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Integer getPrice() {
        return null;
    }

    @Override
    public String toString() {
        System.out.println("Enjoy "+this.name+": "+this.description+"       Cost: "+this.price);
        return null;
    }

    @Override
    public Integer setPrice(Integer price) {
        return null;
    }
}
