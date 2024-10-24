package src.main.mooc.part9.warehousing;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        this.capacity = capacity;
        if (capacity <= 0.0) {
            this.capacity = 0;
        }
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < howMuchSpaceLeft()) {
            balance += amount;
        } else {
            balance += capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        } else if (amount > balance) {
            double whatWeGet = balance;
            balance = 0;
            return whatWeGet;
        }
        balance -= amount;
        return amount;

    }

    @Override
    public String toString() {
        return "balance =" + balance + ", space left " + howMuchSpaceLeft();
    }
}
