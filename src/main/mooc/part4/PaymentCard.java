package src.main.mooc.part4;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    public void eatAffordably(){
        balance-=2.6;
    }
    public void eatHeartily(){
        balance-=4.6;
    }
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
    }
}
