package src.main.mooc.part9.warehousing;

public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return getName() + ": balance= " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
