package mooc.part5;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    // Overloaded constructors
    public Product(String name) {
        this(name, "shelf", 1);
    }
    public Product(String name, String location) {
        this(name, location, 1);
    }
    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg) can be found from the " + location;
    }

    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }

}
