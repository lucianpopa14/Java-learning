package src.main.NestedClasses;

class VendingMachine{
    static class ChocolateBar{
        public String getName(){
            return "Mars";
        }
        public double getPrice(){
            return 12.98;
        }
    }
    static class BagOfChips{
        public String getName(){
            return "Doritos";
        }
        public double getPrice(){
            return 2.98;
        }
    }
}

public class StaticNestedClass{
    public static void main(String[] args){
        VendingMachine.ChocolateBar mikesChocolateBar = new VendingMachine.ChocolateBar();
        VendingMachine.BagOfChips gabbysBagOfChips = new VendingMachine.BagOfChips();
        System.out.println("Mike's "+mikesChocolateBar.getName()+" chocolate bar costs "+ mikesChocolateBar.getPrice());
        System.out.println("Gabby's "+gabbysBagOfChips.getName()+" bag of chips costs "+ gabbysBagOfChips.getPrice());
    }
}
