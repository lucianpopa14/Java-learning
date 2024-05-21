package src.main.codecademy.NestedClasses;

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