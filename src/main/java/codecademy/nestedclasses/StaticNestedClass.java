package codecademy.nestedclasses;


public class StaticNestedClass {
    public static void main(String[] args) {
        VendingMachine.ChocolateBar mikesChocolateBar = new VendingMachine.ChocolateBar();
        VendingMachine.BagOfChips gabbysBagOfChips = new VendingMachine.BagOfChips();
        System.out.println("Mike's " + mikesChocolateBar.getName() + " chocolate bar costs " + mikesChocolateBar.getPrice());
        System.out.println("Gabby's " + gabbysBagOfChips.getName() + " bag of chips costs " + gabbysBagOfChips.getPrice());
    }
}
