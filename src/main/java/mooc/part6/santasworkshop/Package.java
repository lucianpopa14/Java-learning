package mooc.part6.santasworkshop;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    private int totalWeight;

    public Package() {
        this.gifts = gifts;
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
        totalWeight = +gift.getWeight();
    }

    public int totalWeight() {
        return totalWeight;
    }

    //main method to test Package class
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
