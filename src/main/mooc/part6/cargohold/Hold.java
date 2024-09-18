package src.main.mooc.part6.cargohold;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    public Hold(int maxWeight){
        this.maxWeight=maxWeight;
        this.hold=new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        if((totalWeight()+ suitcase.totalWeight())<maxWeight){
            hold.add(suitcase);
        }
    }
    public int totalWeight() {
        int weight = 0;
        for (Suitcase i : hold) {
            weight += i.totalWeight();
        }
        return weight;
    }
    public String toString(){
        return hold.size()+" suitcases ("+totalWeight()+" kg)";
    }

    public void printItems(){
        for(Suitcase s:hold){
            s.printItems();
        }
    }
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
