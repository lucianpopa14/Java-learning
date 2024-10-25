package src.main.mooc.part9.InterfaceInABox;

public class Book implements Packable {
    private String authorName;
    private String name;
    private double weight;

    public Book(String authorName, String name, double weight) {
        this.authorName = authorName;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return authorName + ": " + name;
    }
}
