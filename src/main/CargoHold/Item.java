package src.main.CargoHold;

public class Item {
    String name;
    int weightInKg;

    public Item (String name, int weightInKg){
        this.name = name;
        this.weightInKg = weightInKg;
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weightInKg;
    }
    public String toString(){
        return this.name+" ("+this.weightInKg+"kg)";
    }
    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
    }
}
