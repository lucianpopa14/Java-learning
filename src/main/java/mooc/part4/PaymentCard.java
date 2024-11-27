package mooc.part4;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if (balance-2.6 >= 0) {
            balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (balance-4.6 >= 0) {
            balance -= 4.6;
        }
    }
    public void addMoney(double amount){
        if(balance + amount >= 150){
            balance=150;
        }else if(amount<0) {
        } else{
            balance+=amount;
        }
    }
//    main here just for testing purposes

    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: "+paulsCard);
        System.out.println("Matt: "+mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: "+paulsCard);
        System.out.println("Matt: "+mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: "+paulsCard);
        System.out.println("Matt: "+mattsCard);
    }
}
