package mooc.part4;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println(balance);
    }
    public void waitOneYear(){
        balance = balance*interestRate;
    }
    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.2);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
