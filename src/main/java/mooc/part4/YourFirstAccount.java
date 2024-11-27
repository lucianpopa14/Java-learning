package mooc.part4;

public class YourFirstAccount {
    public static void main(String[] args) {
        Account newAccount = new Account("John", 100.0);
        newAccount.deposit(20);
        System.out.println(newAccount);
    }
}
