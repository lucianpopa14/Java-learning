package mooc.part4;

public class YourFirstBankTransfer {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthew", 1000);
        Account myAccount = new Account("Lucian", 0);
        matthewsAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
