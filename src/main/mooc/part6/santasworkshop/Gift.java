package src.main.mooc.part6.santasworkshop;

public class Gift {

    private String name;
    private int weight;

    public Gift(String name, int weight){
        this.name=name;
        this.weight=weight;
    }
    public String getName(){
        return this.name;
    }

    public int getWeight() {
        return weight;
    }
    public String toString(){
        return this.name+" ("+this.weight+" kg)";
    }
    //main method to test Gift class
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
    }
}
